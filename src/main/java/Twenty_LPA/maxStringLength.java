package Twenty_LPA;

import java.sql.Statement;
import java.util.HashSet;
import java.util.Scanner;

public class maxStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxLength(str));
    }

    public static int maxLength(String str)
    {
        int left = 0 ;
        int maxLength = 0 ;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0  ; i  < str.length() ; i++)
        {
            while(set.contains(str.charAt(i)))
            {
                set.remove(str.charAt(i));
                left++;
            }
            set.add(str.charAt(i));
            maxLength = Math.max(maxLength, i-left+1);

        }
        return maxLength;
    }
}
