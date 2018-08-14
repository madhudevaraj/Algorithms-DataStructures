
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
    int val;

    public static void main(String[] args) {
        Main obj = new Main();

//        root = new Node(50);
//        root.left = new Node(30);
//        root.left.left = new Node(20);
//        root.left.right = new Node(40);
//        root.left.right.right = new Node(45);
//        root.right = new Node(70);
//        root.right.left = new Node(60);
//        root.right.left.left = new Node(55);
//        root.right.left.right = new Node(62);
//        root.right.right = new Node(80);
//        root.right.right.left = new Node(78);
//        root.right.right.right = new Node(85);
//        root.right.right.right.right = new Node(90);
//

        root = new Node(1);
        root.right = new Node(2);

        int val = obj.lca(root,1,2);
        System.out.println(val);

    }

    int lca(Node root, int v1, int v2)
    {
       if(root.data<v1 && root.data<v2)
       {
           lca(root.right,v1,v2);
       }

       else if (root.data>v1 && root.data>v2)
       {
           lca(root.left,v1,v2);
       }

       else if((root.data>v1 && root.data< v2) || (root.data<v1 && root.data> v2))
       {
           val = root.data;
           return val;
       }

       // If tree has only 2 nodes -> 1, 2; and v1=1 and v2=2; then output should be 1
       else if(root.data==v1 || root.data == v2)
       {
           val = root.data;
           return val;
       }

       return val;
    }
}
