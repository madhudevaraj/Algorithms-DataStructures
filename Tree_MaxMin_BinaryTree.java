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

    static Node root;

    public static void main(String[] args) {
        Main obj = new Main();

        root = new Node(25);
        root.left = new Node(60);
        root.left.left = new Node(55);
        root.left.right = new Node(10);
        root.right = new Node(12);
        root.right.left = new Node(5);
        root.right.right = new Node(15);

        int minVal = obj.findMin(root);
        System.out.println(minVal);

        int maxVal = obj.findMax(root);
        System.out.println(maxVal);


    }

    int findMin(Node root)
    {
        if(root.left == null && root.right == null)
        {
            return root.data;
        }

        int lmin= findMin(root.left);
        int rmin = findMin(root.right);

        if(lmin<rmin)
        {
            if(root.data < lmin)
                return root.data;
            else
                return lmin;
        }

        else // rmin <lmin
        {
            if(root.data < rmin)
                return root.data;
            else
                return rmin;
        }
    }

    int findMax(Node root)
    {
        if(root.left==null && root.right==null)
        {
            return root.data;
        }
        int lmax = findMax(root.left);
        int rmax = findMax(root.right);

        if(lmax>rmax)
        {
            if(root.data>lmax)
                return root.data;
            else
                return lmax;
        }

        else
        {
            if(root.data>rmax)
                return root.data;
            else
                return rmax;
        }
    }


}
