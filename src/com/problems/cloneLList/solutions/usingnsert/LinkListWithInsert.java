package com.problems.cloneLList.solutions.usingnsert;
/*
 * Copyright (c) 2010 QUALCOMM Incorporated.
 *           All Rights Reserved.
 * QUALCOMM Proprietary and Confidential/GTDR
 */


import com.problems.cloneLList.solutions.Node;

public class LinkListWithInsert {
    public Node head;

    public LinkListWithInsert(Node head)
    {
        this.head = head;
    }

    public void print(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            Node random = temp.random;
            int randomData = (random != null)? random.data: -1;
            System.out.println("Data = " + temp.data +
                    ", Random data = "+ randomData);
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void push_front(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void cloneList()
    {
        Node curr = head;
        while (curr != null)
        {
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = curr.next.next;
        }

        print(head);
        Node copyHead = head.next;


        Node orig = head;

        while (orig != null)
        {
            Node copy = orig.next;

            copy.random = (orig.random != null) ? orig.random.next : null;

            orig.next = copy.next;
            copy.next = (orig.next != null) ? orig.next.next : null;

            orig = orig.next;
        }

        print(head);
        print(copyHead);
    }

}
