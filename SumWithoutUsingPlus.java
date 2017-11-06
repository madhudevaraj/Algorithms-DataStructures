// Calculate the sum of two integers a and b, but you are not allowed to use the operator +.

import java.io.*;

class SumWithoutUsingPlus
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int a=5, b=6;
        SumWithoutUsingPlus obj = new SumWithoutUsingPlus();
        int res = obj.findSum(a,b);
        System.out.println("Sum is= "+res);
    }
    
    int findSum(int a, int b)
    {
        
        int val=0;
        System.out.println("a: "+a);
        System.out.println("b: "+b+"\nb's complement: "+(~b+1));
        /*
          a + b
        = a - (-b) ;  -b can be written as (~b)+1
        = a - (~b+1)
        = a - (~b) -1
        */ 
        val = a - (~b) -1;
        return val;
        
    }
}
