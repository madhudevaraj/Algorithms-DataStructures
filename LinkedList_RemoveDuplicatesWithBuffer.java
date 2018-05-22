package com.company;

import java.util.HashSet;
import java.util.Hashtable;

class Node{
    int data;
    Node next;

    Node(int data)
    {
      this.data=data;
      this.next=null;
    }
}

public class Main {

    Node first;

    public static void main(String[] args) {

        Main obj = new Main();

        obj.createLinkedList();
        obj.printList();

        obj.removeDuplicate();
        obj.printList();



    }

    void createLinkedList()
    {
        first = new Node(5);
        Node second = new Node(4);
        Node third = new Node(7);
        Node fourth = new Node(5);
        Node fifth = new Node(3);
        Node sixth = new Node(3);
        Node seventh = new Node(4);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;

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

    void removeDuplicate()
    {
        HashSet<Integer> hs = new HashSet<>();
        Node n = first.next;
        Node prev = first;

        hs.add(first.data);

        //check if each linked list element is in hashset.
        while(n != null)
        {
            // If element is in hashset, delete the node by using prev node
            if(hs.contains(n.data))
            {
                prev.next = n.next;
                n=n.next;
                // If you increment 'prev' node, then both 'n' and 'prev' will start pointing to the same node. You can find it out by tracing the program
                //prev=prev.next;
            }

            // Else, add the element to hashset and move fwd
            else
            {
               hs.add(n.data);
               n=n.next;
               prev=prev.next;
            }
        }

    }
}
