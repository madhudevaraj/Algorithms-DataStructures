import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] a = new int[]{1,5,8,2,4,7,5,14};
        ContainsDuplicate obj = new ContainsDuplicate();

        boolean val = obj.checkDuplicate(a);
        if(val)
        {
            System.out.println("Contains duplicates");
        }
        else
        {
            System.out.println("No duplicates");
        }
    }

    boolean checkDuplicate(int[] a) {
        Set<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < a.length; i++)
        {
            if (hs.contains(a[i]))
                {
                    return true;
                }
                else
                {
                    hs.add(a[i]);
                }
        }
        return false;
    }
}
