// Creating linked list manually along with method to automatically insert node in linked list in required position
// and deleting any given node in linked list

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

public class Main {

    // Have to make it static else you won't be able to use it in main method without creating object since main method is static
    static Node first;

    public static void main(String[] args) {
	// write your code here

        Main obj = new Main();

        first = new Node(5);
        Node second = new Node(4);
        Node third = new Node(7);
        Node fourth = new Node(2);
        Node fifth = new Node(3);
        Node sixth = new Node(6);
        Node seventh = new Node(8);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;

        obj.printList();

        obj.delete(second);
        obj.printList();

        obj.delete(first);
        obj.printList();

        obj.delete(seventh);
        obj.printList();

        obj.insert(5,1);
        obj.printList();

        obj.insert(4,2);
        obj.printList();

        obj.insert(8,7);
        obj.printList();


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

    void delete(Node del)
    {

        // if node is last node
        if(del.next == null)
        {
            //find previous node of last node and point it to null

            Node prev=first;

            while(prev.next.next !=null)
            {
               prev=prev.next;
            }

            prev.next = null;
        }
        else
        {
            // Copy data from next node(next node of del's node) to del node and delete del node
            del.data=del.next.data;
            del.next=del.next.next;

        }

    }

    void insert(int data, int pos)
    {
        // if pos=1, then no need to find previous node
        if(pos==1)
        {
         Node newNode = new Node(data);
         newNode.next = first;
         // then make newly added first node as "first" so that print method can use it
            first = newNode;
        }

        // else find previous node
        else
        {
            Node prev=first;
            int i=1;

            // Finding previous node
            while(i!=pos-1)
            {
                prev=prev.next;
                i++;
            }

            Node newNode = new Node(data);
            newNode.next = prev.next;
            prev.next = newNode;

        }

    }
}
