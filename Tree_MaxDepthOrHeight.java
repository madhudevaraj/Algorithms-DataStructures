class Node{
    int data;
    Node right, left;

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

        root = new Node(50);
        root.left = new Node(30);
        root.left.right = new Node(40);
        root.left.right.left = new Node(35);
        root.right = new Node(70);
        root.right.right = new Node(80);

        obj.findDepth();
    }

    void findDepth()
    {
        int h = depth(root);
        System.out.println(h-1);
    }

    int depth(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int ldepth = depth(root.left);
        int rdepth = depth(root.right);

        if(ldepth > rdepth)
            return ldepth + 1;
        else
            return rdepth + 1;
    }


}
