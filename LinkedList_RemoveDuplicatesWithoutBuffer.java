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

public class LinkedList_RemoveDuplicatesWithoutBuffer {

    Node first;

    public static void main(String[] args) {

        LinkedList_RemoveDuplicatesWithoutBuffer obj = new LinkedList_RemoveDuplicatesWithoutBuffer();

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
        // Remove duplicates using 2 pointers - cur and runner.
        // Cur is current element and runner pointer runs thru entire linked list and checks against each element.

        Node cur = first;

        while(cur != null)
        {
            int count=0;
            Node runner = first;
            while(runner != null)
            {
               if(runner.data == cur.data)
               {
                   count++;
               }
               runner = runner.next;
            }

            // if there are more than 1 same element, ie., if there is a duplicate, then delete the current node
            // Also, check if the node to be deleted is the last node
            if (count>1)
            {
                // Node to be deleted is last node
                if(cur.next == null)
                    {
                        Node prev = first;
                        //To find last but one node
                        while(prev != null)
                        {
                            if (prev.next.next == null)
                            {
                                prev.next = null;
                            }
                            prev = prev.next;
                        }

                    }
                // Node to be deleted is NOT last node
                else
                    {
                    cur.data = cur.next.data;
                    cur.next = cur.next.next;
                    }
            }

            cur = cur.next;
        }

    }
}
