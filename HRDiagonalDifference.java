//Diagonal Difference - Hacker Rank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        int priD=0,secD=0;
        
        int rows = a.length; // since number of rows = number of columns
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++)
            {
                if(i == j)
                {
                    priD = priD+a[i][j];
                }
                
                if( i+j == rows-1)
                {
                    secD = secD+a[i][j];
                }
            }
        }
       
        return Math.abs(priD-secD);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
