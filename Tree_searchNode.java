class Node{

    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Main {

    static Node root=null;

    public static void main(String[] args) {

        Main obj = new Main();

        root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int key = 60;

        boolean value = obj.search(root, key);

        if(value)
            System.out.println("Key is present!");
        else
            System.out.println("Key is NOT present!");
    }

    boolean search(Node root, int key)
    {
        // base case
        if(root == null)
        {
          return false;
        }

        if(key == root.data)
        {
            return true;
        }

        else if(key<root.data)
        {
            return search(root.left, key);
        }

        else if (key>root.data)
        {
            return search(root.right, key);
        }

        return false;
    }

    // Alternative method:
    /* boolean search(Node root, int key)
    {
        boolean val;

        if(root == null)
        {
           return false;
        }

        if(root.data == key)
        {
            return true;
        }
        if(key <root.data)
        {
           val = search(root.left, key);
        }
        else
        {
           val = search(root.right, key);
        }

       return val;
    } */
}
