package Coforge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class nonRepetingChaarcters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ","").toLowerCase();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for(char ch: str.toCharArray())
        {
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer> entr: charCount.entrySet())
        {
            if(entr.getValue()==1)
            {
                System.out.println(entr.getKey());
            }
        }
    }
}
