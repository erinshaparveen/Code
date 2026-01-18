package MNC;

import java.util.*;

public class duplicateFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String actualStr = sc.nextLine();
        for(char ch: actualStr.toCharArray())
        {
            if(set.add(ch))
            {
                str.append(ch);
            }
        }
        System.out.println(str);
    }
}
