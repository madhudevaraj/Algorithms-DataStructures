// Given a binary tree, find its maximum depth.
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

import java.io.*;

class Node
{
    Node left;
    Node right;
    int data;
    
    Node(int val)
    {
        data = val;
        System.out.println("Node "+val);
        
    }
}

class BinaryTreeMaxDepth
{
    // root is object of class "Node" to be used in this class and in this class it is a member variable which can be accessed using object of this class
    Node root;
    
    public static void main (String[] args) throws java.lang.Exception
    {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();
        
        System.out.println("Nodes in the tree:");
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.right.right.right = new Node(6);
        
        
        int maxVal = tree.maxDepth(tree.root);
        
        System.out.println("Maximum depth of tree = "+maxVal);
    }
    
    int maxDepth(Node root)
    {
        // Base case - when a node is null, return 0
        if(root == null){
            return 0;
        }
        // Find max depth of left subtree - ldepth
        int ldepth = maxDepth(root.left);
        
        // Find max depth of right subtree - rdepth
        int rdepth = maxDepth(root.right);
        
        //System.out.println(ldepth+" "+rdepth);
        // Compare ldepth and rdepth. If ldepth is bigger, return ldepth+1 else rdepth+1
        if(ldepth > rdepth){
            return ldepth+1;
        }
        else{
            return rdepth+1;
        }
    }
}