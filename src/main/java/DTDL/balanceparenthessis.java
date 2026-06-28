package DTDL;
import java.util.*;

public class balanceparenthessis {
    public static void main(String[] args) {
        String str = "{[(())]}[";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i <str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch=='(')
                stack.push(ch);
            else
                if(stack.isEmpty())
                {
                    System.out.println("Invalid");
                    return;
                }
                else if ((ch == '}' && stack.peek()!='{') ||
                        (ch == ']' && stack.peek()!= '[') ||
                        (ch == ')' && stack.peek() !='('))
                {
                    System.out.println("Invalid hgj");
                    return;
                }
                else
                {
                    stack.pop();
                }
        }
        System.out.println(stack.isEmpty());
    }
}
