package Revision;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(revString(str));
    }
    public static String revString(String str)
    {
        char ch;
        String revString = "";
        for(int i = str.length()-1; i>=0 ;i--)
        {
            ch = str.charAt(i);
            revString =  revString + ch;
        }
        return revString;
    }
}
