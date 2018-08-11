
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

    static Node root=null;

    public static void main(String[] args) {

        Main obj = new Main();


        root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.left.right.right = new Node(45);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.right.right.right = new Node(80);
        root.right.right.right.right = new Node(80);

        int val = obj.checkBalanced(root);
        if(val<=1)
        {
            System.out.println("balanced");
        }
    }

   int checkBalanced(Node root)
   {
       if(root == null)
       {
           return 0;
       }
        int lefth  = checkBalanced(root.left);
        int righth = checkBalanced(root.right);

        // At any point in program if difference between height of left subtree and height of right subtree is greater than 1, then it is not balanced
        if(Math.abs(lefth-righth) > 1)
        {
            System.out.println("Not balanced");
            System.exit(0);
        }

        if(lefth > righth)
            return lefth+1;
        else
            return righth+1;

   }

}
