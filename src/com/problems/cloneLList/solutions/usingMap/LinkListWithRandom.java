package com.problems.cloneLList.solutions.usingMap;
/*
 * Copyright (c) 2010 QUALCOMM Incorporated.
 *           All Rights Reserved.
 * QUALCOMM Proprietary and Confidential/GTDR
 */

import java.util.HashMap;
import java.util.Map;

public class LinkListWithRandom {
    public Node head;

    public LinkListWithRandom(Node head)
    {
        this.head = head;
    }

    public void print()
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
        this.head = newNode;
    }

    public LinkListWithRandom clone() {
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node origCurr = this.head;
        Node cloneCurr = null;
        while (origCurr != null)
        {
            cloneCurr = new Node(origCurr.data);
            map.put(origCurr, cloneCurr);
            origCurr = origCurr.next;
        }

        origCurr = this.head;
        while (origCurr != null)
        {
            cloneCurr = map.get(origCurr);
            cloneCurr.next = map.get(origCurr.next);
            cloneCurr.random = map.get(origCurr.random);
            origCurr = origCurr.next;
        }

        return new LinkListWithRandom(map.get(this.head));
    }

}