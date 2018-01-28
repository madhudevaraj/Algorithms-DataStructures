// Time Conversion - Hacker Rank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String[] str;
        str = s.split(":");

        String hour = str[0];
        String min = str[1];
        String sec = str[2].substring(0,2);
        String dayEve = str[2].substring(2,4);

        String newHour ="";
        String newTime = "";

        if(dayEve.equals("AM"))
        {
            newHour = (hour.equals("12")? "00": hour);
        }

        else if (dayEve.equals("PM"))
        {
            int hr = Integer.parseInt(hour)+12;
            newHour = (hour.equals("12")? "12": Integer.toString(hr));
        }
        newTime = newHour+":"+min+":"+sec;
        return newTime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
