package com.problems.cloneLList.solutions.usingnsert;

import com.problems.cloneLList.solutions.Node;

/**
 * Created by zongjunq on 8/7/2015.
 */
public class Main {
    public static void main(String[] args) {
        LinkListWithInsert app = new LinkListWithInsert(new Node(5));
        app.push_front(4);
        app.push_front(3);
        app.push_front(2);
        app.push_front(1);

        // Setting up random references.
        app.head.random = app.head.next.next;
        app.head.next.random =
                app.head.next.next.next;
        app.head.next.next.random =
                app.head.next.next.next.next;
        app.head.next.next.next.random =
                app.head.next.next.next.next.next;
        app.head.next.next.next.next.random =
                app.head.next;

        app.print(app.head);

        System.out.println("Cloning...");
        app.cloneList();
//        app.print(app.head);
    }
}
