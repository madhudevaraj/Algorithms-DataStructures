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

public class LinkedList_Reverse {

    static Node first;

    public static void main(String[] args) {

        LinkedList_Reverse obj = new LinkedList_Reverse();

        first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.next=second;
        second.next=third;
        third.next=fourth;

        obj.printList(first);

       Node n = obj.reverse(first);

        obj.printList(n);

    }

    void printList(Node n)
    {

        while(n != null)
        {
            System.out.print(n.data+ " ");
            n=n.next;
        }

        System.out.println("");

    }

    Node reverse(Node first)
    {
        Node prev = null;
        Node cur = first;
        Node next = null;

        while(cur!=null)
        {
            next = cur.next;
            cur.next=prev;

            prev=cur;
            cur=next;
        }

        return prev;

    }

}
