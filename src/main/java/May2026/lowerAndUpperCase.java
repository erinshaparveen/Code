package May2026;

import java.util.Scanner;

public class lowerAndUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
                lowerCase.append(str.charAt(i));
            else
                upperCase.append(str.charAt(i));
        }
        System.out.println(lowerCase+ " "+ upperCase);
    }
}
