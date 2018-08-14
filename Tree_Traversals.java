class Node
{
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

    static Node root;


    public static void main(String[] args) {

        Main obj = new Main();

        // creating tree
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        System.out.println("Preorder traversal:");
        obj.preorder(root);

        System.out.println("\nInorder traversal:");
        obj.inorder(root);

        System.out.println("\nPostorder traversal:");
        obj.postorder(root);

    }

    void preorder(Node root)
    {
        // base case
        if(root == null)
        {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder( root.right);
        System.out.print(root.data+" ");
    }


}
