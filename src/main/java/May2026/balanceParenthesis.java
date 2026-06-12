package May2026;

import java.util.*;

public class balanceParenthesis {
    public static void main(String[] args) {
        String str = "{{{([])}}}";
        Stack<Character> stck = new Stack<>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == '{' || ch =='[' || ch =='(')
            {
                stck.push(ch);
            }
            else
            {
                if(stck.isEmpty())
                {
                    System.out.println("Invalid*");
                    return;
                }

                else {
                    char top = stck.pop();
                    if((ch==')' && top != '(') || (ch == ']' && top !='[') || (ch == '{' && top !='}'))
                    {
                        System.out.println("Invalid**");
                        return;
                    }
                }
            }
        }

        if(stck.isEmpty())
        {
            System.out.println("Valid");
        }

        else
        {
            System.out.println("Invalid***");
        }
    }
}
