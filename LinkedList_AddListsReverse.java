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

public class LinkedList_AddListsReverse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList_AddListsReverse obj = new LinkedList_AddListsReverse();
        Node a = new Node(1);
        Node b = new Node(9);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(7);
        Node f = new Node(3);
        a.next = b;
        b.next = c;

        d.next = e;
        e.next = f;

        obj.printList(a);
        obj.printList(d);

        Node p = obj.addList(a, d);

        obj.printList(p.next);
    }

    void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println("");
    }

    Node addList(Node n1, Node n2)
    {
        int carry=0;
        int sum;
        Node start = new Node(0);
        Node resNode = start;

        while(n1!=null && n2!=null)
        {
            //add both elements from the two lists and set carry if present
            sum = n1.data+n2.data+carry;
            int newSum=sum%10;
            n1=n1.next;
            n2=n2.next;
            resNode.next= new Node(newSum);
            resNode = resNode.next;

            carry = sum/10;
        }

        if(carry!=0)
        {
            resNode.next = new Node(carry);
        }

        return start;
    }

}
