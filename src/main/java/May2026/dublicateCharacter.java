package May2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dublicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry+" ");
            }
        }
    }
}
