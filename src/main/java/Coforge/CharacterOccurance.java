package Coforge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
