// Plus Minus - Hacker Rank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        
        float pos=0, neg=0, zer=0;
        int len = arr.length;
        
        for(int i=0; i<len; i++)
        {
            if(arr[i]>0)
                pos++;
            else if (arr[i]<0)
                neg++;
            else
                zer++;
        }
         DecimalFormat df = new DecimalFormat("###.######");
        System.out.print(df.format(pos/len)+"\n"+df.format(neg/len)+"\n"+df.format(zer/len));
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
