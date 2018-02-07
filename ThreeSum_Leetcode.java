/* Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] a = new int[]{0,0,0};
        ThreeSum obj = new ThreeSum();
        List<List<Integer>> ansList = obj.threeSum(a);

        for(int i =0; i<ansList.size();i++)
        {
            System.out.print(ansList.get(i));
        }
    }

    public List<List<Integer>> threeSum(int[] a) {

        int l,r;
        List<List<Integer>> bigList = new ArrayList<List<Integer>>();

        Arrays.sort(a);

        for(int i=0; i<a.length-2; i++)
        {
            l=i+1;
            r=a.length-1;
//            System.out.print(a[i]+" "+a[l]+" "+a[r]+" ");
//            System.out.print(i+" "+l+" "+r+" ");

            while(l<r)
            {
//                System.out.print(a[i]+" "+a[l]+" "+a[r]+" ");
                if(a[i]+a[l]+a[r] == 0)
                {
                    List<Integer> smallList = new ArrayList<Integer>();
                    // add it to small list
                    smallList.add(a[i]);
                    smallList.add(a[l]);
                    smallList.add(a[r]);
                    if(!bigList.contains(smallList))
                    {bigList.add(smallList);}
                    l++;
                }

                else if(a[i]+a[l]+a[r] < 0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }

        return bigList;

    }
}
