import java.util.*;

public class RomanToInteger {

    public static void main(String[] args) {
        String s = new String("MCDLXXVI");

        RomanToInteger obj = new RomanToInteger();
        int num = obj.romanToInt(s);
        System.out.println("\n\nRoman:"+s+"\nInteger:"+ num);

    }

    int romanToInt(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer> ();
        int len = s.length();
        int[] a = new int[len];
        int j=len-1;

        // Adding basic roman - integer values to hashmap
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        //Displaying hashmap
        for(HashMap.Entry<Character,Integer> m: hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // adding interger value of each roman digit to array in reverse order
        for(int i=0 ; i<= s.length()-1; i++)
        {
          Character ch = s.charAt(i);
          int val = hm.get(ch);
          a[j--] = val;
        }

        //Displaying array
        for(int i=0 ; i< a.length; i++)
        System.out.print(a[i]+" ");

        // Main logic

        int sum=a[0];
        for(int i=1; i< a.length; i++)
        {
            int k = i-1;
            if(a[i] >= a[k])
            {
                sum = sum+a[i];
            }
            else
            {
                sum = sum - a[i];
            }
        }

        return sum;

    }
}
