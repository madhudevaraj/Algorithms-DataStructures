//Anagram

//s1 = "anagram"; s2 = "gr m aan a"; They are anagrams

import java.util.*;

class Anagram
{
    public static void main(String[] args)
    {
        String s1 = "madhud";
        String s2 = "uhd am d";

        Anagram obj = new Anagram();
        boolean val = obj.isAnagram(s1, s2);

        if(val)
        {
            System.out.println("\nThey are anagrams!");
        }

        else
        {
            System.out.println("\nThey are not anagrams!");
        }
    }

    public boolean isAnagram(String s1, String s2)
    {
        // If s1 or s2 is null, they are not anagrams
        if (s1 == null || s2 == null)
        {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        // Capture all s1's characters and its respective count in a hashmap
        
        // s1.length() for string size ; a.length for array size ; al.size() for array list size

        for (int i = 0; i < s1.length(); i++) 
        {
            char c = s1.charAt(i);
            if (hm.containsKey(c))
            {
                hm.put(c, hm.get(c) + 1);
            }

            else
            {
                hm.put(c, 1);
            }
        }

        // Displaying Hashmap containing all s1's characters and its respective count
        System.out.println("Hashmap contents after scanning s1");
        for (Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        /* For every character in s2, decrease respective character's count in hashmap.
           Else if character in s2 is not present in s1 hashmap, they are not anagrams.
           Ignore white spaces by setting its count to zero */
        
        // ch != ' '; ' ' stands for charcter; " " stands for string

        for (int i = 0; i < s2.length(); i++)
        {
            char ch = s2.charAt(i);
            if (hm.containsKey(ch) && ch != ' ')
            {
                hm.put(ch, hm.get(ch) - 1);
            }

            else if (ch == ' ')
            {
                hm.put(' ', 0);
            }

            else
            {
                return false;
            }

        }

        System.out.println("\nModified Hashmap contents after scanning s2");
        for (Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // If all values is 0 in hashmap for each key, then they are anagrams.
        // Else, they are not anagrams

        for (Integer value : hm.values())
        {
            if (value != 0)
            {
                return false;
            }
        }

        return true;

    }
}
