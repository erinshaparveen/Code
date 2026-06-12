package May2026;

import java.util.HashSet;
import java.util.Scanner;

public class maxLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxLength(str));
    }

    public static int maxLength(String str)
    {
        int maxlength = 0 ;
        int left = 0 ;
        HashSet<Character> set =new HashSet<>();
        for(int i = 0 ; i < str.length() ; i++ )
        {
            while(set.contains(str.charAt(i)))
            {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            maxlength =Math.max(maxlength, i-left+1);
        }
        return maxlength;
    }
}
