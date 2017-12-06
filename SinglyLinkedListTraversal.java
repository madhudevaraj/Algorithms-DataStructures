// Singly linked list Traversal
public class SinglyLinkedListTraversal {

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

    public void print()
    {
        Node n = head;

        // n != null means until data in node is not null
        while (n != null)
        {
            //n.next==null means address of next node is null ie, we have encountered last node

                System.out.print(n.data+" ");
            // To print address of next node
            // System.out.print(n.next+" ");
                n = n.next;

        }
    }


    public static void main(String[] args) {

        SinglyLinkedListTraversal list = new SinglyLinkedListTraversal();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        list.print();
    }
}


