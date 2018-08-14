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

    static Node root, min,max;

    public static void main(String[] args) {
        Main obj = new Main();

        root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.left.right.left = new Node(35);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        min = obj.findMin(root);
        System.out.println(min.data);
        min = obj.findMax(root);
        System.out.println(min.data);

    }

    Node findMin(Node root)
    {
       if(root.left == null && root.right == null)
       {
           min=root;
           return min;
       }

       Node val = findMin(root.left);

       return val;
    }

    Node findMax(Node root)
    {
        if(root.left == null && root.right == null)
        {
            max=root;
            return max;
        }

        Node val = findMax(root.right);

        return val;
    }


}
