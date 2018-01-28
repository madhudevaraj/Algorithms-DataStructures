// Birthday Cake Candles - Hacker Rank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] a) {
        
        // Find max and insert each to hashmap
        
        int max = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
            
            if(hm.containsKey(a[i]))
            {
               hm.put(a[i],hm.get(a[i])+1);
            }
            else
            {
              hm.put(a[i],1);  
            }
        }
        
        int num = hm.get(max);
        return num;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
