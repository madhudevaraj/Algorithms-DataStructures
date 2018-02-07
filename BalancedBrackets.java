// Balanced Brackets

import java.util.*;
public class Main {

    public static void main(String[] args) {
        String s = "){";
        Main obj = new Main();
        boolean val = obj.isValid(s);
        System.out.println(val);
    }

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<Character>();

        if(s.length()%2 != 0)
        {
            return false;
        }

        for(int i =0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            switch(ch)
            {
                case '{' : st.push('}');
                    break;
                case '[' : st.push(']');
                    break;
                case '(' : st.push(')');
                    break;
                default: if(i==0 || st.peek() != ch){return false;} else {st.pop(); break;}
            }

        }

        return st.empty();

    }
}
