// Mini-Max Sum - Hacker Rank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] a) {
        int min=Integer.MAX_VALUE,max=0;
        long sum=0;
        for(int i =0; i<a.length; i++)
        {
          if(a[i]<min)
          {
              min = a[i];
          }
            
            if (a[i]> max)
            {
                max = a[i];
            }
            
            sum = sum + a[i];
        }
        System.out.print(sum-max+" "+(sum-min));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
