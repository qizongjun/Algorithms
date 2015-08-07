package com.problems.cloneLList;
/*
 * Copyright (c) 2010 QUALCOMM Incorporated.
 *           All Rights Reserved.
 * QUALCOMM Proprietary and Confidential/GTDR
 */

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



}