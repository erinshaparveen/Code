package Twenty_LPA;

import java.util.Scanner;
import java.util.Stack;

public class balanceParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stck = new Stack<>();
        for(char ch : str.toCharArray())
        {
            if(ch == '{' || ch == '['|| ch=='(')
            {
                stck.push(ch);
            }
            else
            {
                if(stck.isEmpty())
                {
                    System.out.println("invalid");
                    return;
                }
                else
                {
                    char top = stck.pop();
                    if((ch=='}' && top != '{' ) || (ch == ')' && top !='(' ) || (ch == ']' && top != '['))
                    {
                        System.out.println("invalid");
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
            System.out.println("Invalid");
        }
    }
}
