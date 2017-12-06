// Singly linked list

public class SinglyLinkedList {

    Node head;

   // Inner class. This inner class is made static so that main() can access it
    static class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            this.data =val;
            this.next = null;
            System.out.println("Inside constructor: "+this.data+" --> "+this.next);
        }
    }


    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        /*

        // OR
        list.head=new Node(1);
        Node second = new Node(2);
        Node third = new Node (3);

        // link second node with first node
        list.head.next = second;

        // link third node with second node
        second.next = third;

        */

        System.out.println("Data inside each node: "+list.head.data+" "+list.head.next.data+" "+list.head.next.next.data);
        System.out.println("Address of next node or pointer to next node or value in 'next' for each node: "+list.head.next+" "+list.head.next.next+" "+list.head.next.next.next);

    }
}

