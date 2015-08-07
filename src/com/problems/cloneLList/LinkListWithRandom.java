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
        Node cur = head;
        while (cur != null)
        {
            System.out.print(cur.data);
            System.out.print(" --> ");
        }

        System.out.println("null");
    }

    public void push_front(int data)
    {
        if (head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node newNode = new Node(data);
            newNode.next = head;
            this.head = newNode;
        }
    }



}