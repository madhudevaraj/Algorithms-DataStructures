class Node{

   int data;
   Node left,right;

   Node(int data)
   {
       this.data=data;
       left=null;
       right=null;
   }
}

public class Main {

    public static void main(String[] args) {

        Main obj = new Main();
        int[] a = {1,2,3,4,5};

        Node root = obj.createBst(a,0,a.length-1);

        obj.preorder(root);
    }



    Node createBst(int[] a,int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        //find mid and create node of it
        int mid = (start+end)/2;
        Node root = new Node(a[mid]);

        root.left = createBst(a,start,mid-1);
        root.right = createBst(a,mid+1,end);

        return root;
    }

    void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

}
