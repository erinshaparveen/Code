package OneEight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("Anangram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

        //using HashMap
        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: str1.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(char ch : str2.toCharArray())
        {
            if(!map.containsKey(ch))
            {
                return false;
            }
                map.put(ch, map.get(ch)-1);
            if(map.get(ch)==0)
            {
                map.remove(ch);
            }
        }
        return map.isEmpty();


    }
}
