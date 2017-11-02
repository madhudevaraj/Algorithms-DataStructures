// Given an array of integers, every element appears twice except for one. Find that single one.
// Algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

import java.io.*;

class SingleNumberUsingXOR
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] n = new int[] {1,2,2,1,3,4,5,4,3};
        SingleNumberUsingXOR obj = new SingleNumberUsingXOR();
        int result = obj.singleNum(n);
        
        System.out.println("Single number is = "+result);
        
    }
    
    public int singleNum(int[] nums)
    {
        int res = nums[0];
        System.out.println(res);
       for(int i=1; i<nums.length; i++)
       {
          System.out.println("xor of "+res+" "+nums[i]);
          System.out.println("xor of (in binary) "+Integer.toBinaryString(res)+" "+Integer.toBinaryString(nums[i]));
          res = res^nums[i]; 
          System.out.println("res = "+Integer.toBinaryString(res));
       }
        return res;
        
    }
}