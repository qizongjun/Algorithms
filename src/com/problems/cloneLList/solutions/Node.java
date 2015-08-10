package com.problems.cloneLList.solutions;/*
 * Copyright (c) 2010 QUALCOMM Incorporated.
 *           All Rights Reserved.
 * QUALCOMM Proprietary and Confidential/GTDR
 */

public class Node
{
    public int data;
    public Node next;
    public Node random;

    public Node(int data)
    {
        this.data = data;
        this.next = this.random = null;
    }
}
