package com.company;

import java.util.HashSet;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class LinkedList_BeginningCircular {
    static Node first;

    public static void main(String[] args) {
        LinkedList_BeginningCircular obj = new LinkedList_BeginningCircular();

        first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=third;

        obj.getCircularNode(first);
    }

    void getCircularNode(Node n)
    {
        HashSet<Node> hs = new HashSet<>();

        while(n!=null)
        {
            if(hs.contains(n))
            {
               System.out.println(n.data);
               break;
            }

            else
            {
                System.out.println(n.data+" "+n);
                hs.add(n);
            }

            n=n.next;
        }
    }


}
