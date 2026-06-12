package May2026;

import java.util.*;

public class anagramofTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        HashMap<Character ,  Integer> map = new HashMap<>();
        for(int i = 0 ; i < str1.length() ;i++)
        {
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i = 0 ; i < str2.length() ;i++)
        {
            char ch = str2.charAt(i);
            if(!map.containsKey(ch))
            {
                return false;
            }
            else
            {
                map.put(ch, map.get(ch)-1);
            }
            if(map.get(ch) == 0)
            {
                map.remove(ch);
            }
        }
        return true;
    }
}
