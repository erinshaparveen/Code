package OneEight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class firstNonRepeateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ;i<str.length(); i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        for(char ch : map.keySet())
        {
            if(map.get(ch)==1)
            {
                System.out.println(ch);
                break;
            }
        }

    }
}
