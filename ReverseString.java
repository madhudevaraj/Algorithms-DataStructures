
// Reverse a string // Palindrome

import java.io.*;

class ReverseString
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String a = "madhu";
        int len = a.length();
        
        ReverseString obj = new ReverseString();
        String reverseString = obj.reverse(a,len);
        
        // Comparing 2 strings
        if (reverseString.equals(a))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        
    }
    
    public String reverse(String b, int len) 
    {
        System.out.println(b);
        
        String c = "";
        
        for(int i=len-1; i>=0 ; i--)
        {
            c = c + b.charAt(i);
            System.out.println(c);

        }
        
        return c;
        
    }
}
