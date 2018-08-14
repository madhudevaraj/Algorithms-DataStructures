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

    static Node root = null;

    public static void main(String[] args) {

        Main obj = new Main();

        obj.insert(50);
        obj.insert(30);
        obj.insert(20);
        obj.insert(40);
        obj.insert(70);
        obj.insert(60);
        obj.insert(80);

        System.out.println("Nodes in the tree (inorder traversal): ");
        obj.inorder(root);
    }

    void insert(int data)
    {
        root = insertNode(root,data);
    }

    Node insertNode(Node root, int data)
    {
        if(root == null)
        {
            Node temp = new Node(data);
            return  temp;
        }

        if(data < root.data)
        {
            root.left = insertNode(root.left, data);
        }

        else if(data > root.data)
        {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    void inorder(Node root)
    {
        //base case
        if(root == null)
        {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

}
