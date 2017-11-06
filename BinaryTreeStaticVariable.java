// Demo of how Static varible works using Binary tree node and counter example

import java.io.*;

// Each node of Binary tree
class Node
{
    Node left;
    Node right;
    int data;
    
    // Constructor
    Node(int val)
    {
        left=right=null;
        data =val;
        System.out.println("node "+val);
    }
}

class AnotherClass
{
    int counterA=0;
    static int counterB=0;
    
    void display()
    {
       System.out.println("counter A: "+(++counterA)); 
       System.out.println("static counter B: "+(++counterB));
       System.out.println("=================="); 

    }
}

class BinaryTreeStaticVariable
{
    // 'root' is object of class 'Node' and 'root' is member variable of class BinaryTreeStaticVariable
    static Node root = new Node(5);
 
    public static void main (String[] args) throws java.lang.Exception
    {
        // tree and tree2 are objects of class BinaryTreeStaticVariable.
        // They can used to access member variable of the class ie, "root"
        // Both objects tree and tree2 use the same copy of member variable "root" since it is static
       BinaryTreeStaticVariable tree = new BinaryTreeStaticVariable();
       BinaryTreeStaticVariable tree2 = new BinaryTreeStaticVariable();
        
        if(tree.root == tree2.root)
        {
            System.out.println("Both are same");
            System.out.println(tree.root.data+" <Tree1 and Tree2 root data> "+tree2.root.data);
        }
        System.out.println("hello");
        
        // Creating objects of AnotherClass
        AnotherClass s1 =new AnotherClass();
        AnotherClass s2 =new AnotherClass();
        AnotherClass s3 =new AnotherClass();
        
        // Calling display function using object of AnotherClass
        // All 3 objects are created, they use different copy of counterA and same copy of counterB since counterB is static
        // Because objects use single copy of static variable
        s1.display();
        s2.display();
        s3.display();
        
    }
}
