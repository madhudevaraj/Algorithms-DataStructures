// Static methods

import java.io.*;

class StaticMethod
{
    // Main method is always static method
    public static void main (String[] args) throws java.lang.Exception
    {
      System.out.println("Hi");  
        
        // Static method foo being called without using object of this class
        foo();
        
        // Static method foo2 of another class being called without creating object of 'AnotherClass' class.
        //Accessing foo2 method by using class name itself
        AnotherClass.foo2();
    }
    
    static void foo ()
    {
     System.out.println("Hello 1");    
    }
}

class AnotherClass
{
    static void foo2()
    {
      System.out.println("Hello 2");   
    }
}

// Without static method

// import java.io.*;

// class WithoutStaticMethod
// {
    
//     // Main method is always static method
//     public static void main (String[] args) throws java.lang.Exception
//     {
//       System.out.println("Hi");
        
        
//         // Non-Static method foo can be called only by creating obj of class in which foo is present
//         WithoutStaticMethod obj = new WithoutStaticMethod();
//         obj.foo();
        
//         // Non-Static method foo2 can be called only by creating obj of class in which foo2 is present
//         AnotherClass abc = new AnotherClass();
//         abc.foo2();
//     }
    
//     void foo()
//     {
//      System.out.println("Hello 1");
//     }
// }

// class AnotherClass
// {
//     void foo2()
//     {
//       System.out.println("Hello 2");   
//     }
// }

