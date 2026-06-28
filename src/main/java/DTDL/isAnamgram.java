package DTDL;

import java.util.HashMap;
import java.util.Scanner;

public class isAnamgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isanagram(str, str2));
    }

    public static boolean isanagram(String str1, String str2)
    {
        if(str1.length()!= str2.length())
        {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0 ; i <str1.length();i++)
        {
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i = 0 ; i < str2.length(); i++)
        {
            char ch = str2.charAt(i);
            if(!map.containsKey(ch))
            {
                return false;
            }
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)-1);
            }
            if(map.get(ch) == 0)
            {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
