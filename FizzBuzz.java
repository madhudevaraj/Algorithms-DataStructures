// package whatever; // don't place package name!

import java.io.*;
import java.util.*;

class FizzBuzz
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int n = 15;
        
        FizzBuzz obj = new FizzBuzz();
        List<String> result = obj.fizzbuzz(n);
        
        for(String element: result)
        {
            System.out.println(element);
        }
    }
    
    public List<String> fizzbuzz(int n)
    {
        List<String> ls = new ArrayList<String>();
        
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5 ==0)
            {
            ls.add("FizzBuzz");
            }
            else if(i%3==0)
            {
             ls.add("Fizz");  
            }
            else if(i%5==0)
            {
             ls.add("Buzz");  
            }
            
            else
                
            ls.add(Integer.toString(i));
        }
        
        return ls;
    }
}
