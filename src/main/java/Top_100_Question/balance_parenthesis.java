package Top_100_Question;

import java.util.Scanner;
import java.util.Stack;

public class balance_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println(check_balance_parenthesis(expression));
    }
    public static String check_balance_parenthesis(String str)
    {

        Stack<Character> expression_stck = new Stack<>();
        if (str.isEmpty()) {
            return "Balanced";
        }
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch =='{' || ch =='[')
            {
                expression_stck.push(ch);
            }
            if(ch == ')' || ch =='}' || ch ==']')
            {
                if(expression_stck.isEmpty())
                {
                    return "Not Balanced|";
                }
                char top = expression_stck.peek();
                if(ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[')
                {
                    expression_stck.pop();
                }
                else {
                    return "Not Balanced";
                }
            }

        }
        return expression_stck.isEmpty()?"Balanced":"Not Balanced?";
    }
}
