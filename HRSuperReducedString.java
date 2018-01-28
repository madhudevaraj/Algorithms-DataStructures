// Super Reduced String - Hacker Rank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
           if(hm.containsKey(ch))
           {
              hm.put(ch, hm.get(ch)+1); 
           }
            else
            {
              hm.put(ch, 1);  
            }
        }
              String newstr="";
              for(Map.Entry m: hm.entrySet())
              {
                  int val = (int)m.getValue();
                  if(val%2 !=0)
                  {
                    newstr = newstr+m.getKey(); 
                  }
              }
             if(newstr != "")
                {
                  return newstr;
                }
            else
                {
                    return "Empty String";
                }
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
