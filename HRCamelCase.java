// CamelCase - Hacker Rank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int camelcase(String s) {
        
        int count =1;
        
        for(int i=0; i< s.length(); i++)
        {
            int ascii = (int) s.charAt(i);
            if(ascii >= 65 && ascii <= 90)
            {
                count++;
            }
        }
        return count;
   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
