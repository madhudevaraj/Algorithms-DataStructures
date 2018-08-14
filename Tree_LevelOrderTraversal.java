import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;

    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Main {

    static Node root;

    public static void main(String[] args) {

        Main obj = new Main();

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        //root.right.left = new Node(6);
        root.right.right = new Node(7);
        //root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.left.right.right.right = new Node(10);

        obj.levelorder(root);

    }

    void levelorder(Node root)
    {

        //Important: Queue<Node> else Queue will store nodes in the form of objects
        //Important: Queue<Node> q = new LinkedList<>(); else you will get an error saying that queue is not initialized. You cannot initialize a queue
        //with null since you will get null pointed exception. Queue is an interface and not a class you cannot instantiate as Queue<Node> q = new Queue<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node ele;

        while(!q.isEmpty())
        {
           ele =  q.poll();
           System.out.println(ele.data);

           if(ele.left != null)
            {
                q.add(ele.left);
            }
            if(ele.right != null)
            {
                q.add(ele.right);
            }

        }

    }


}
