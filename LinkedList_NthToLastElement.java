package com.company;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class LinkedList_NthToLastElement {

    Node first;

    public static void main(String[] args) {
	// write your code here
        LinkedList_NthToLastElement obj = new LinkedList_NthToLastElement();

        obj.createList();
        obj.printList();
        obj.nthToLast(obj.first,3);

    }

    void createList()
    {
        first = new Node(5);
        Node second = new Node(4);
        Node third = new Node(7);
        Node fourth = new Node(8);
        Node fifth = new Node(3);
        Node sixth = new Node(6);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;

    }

    void printList()
    {
        Node n=first;

        while(n != null)
        {
            System.out.print(n.data+ " ");
            n=n.next;
        }

        System.out.println("");

    }

    int nthToLast(Node n, int k)
    {
        //Base case
        if (n == null)
        {
            return 0;
        }

        int i = nthToLast(n.next, k) + 1;

        if (i == k)
        {
            System.out.println(n.data);
        }
        return i;

    }
}
