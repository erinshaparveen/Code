package Twenty_LPA;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        String revStr = "";
        for(int i =0 ; i<str.length();i++)
        {
            ch = str.charAt(i);
            revStr = ch+revStr;
        }
        System.out.println(revStr);

        StringBuilder strBuild = new StringBuilder(str);
        String revString = strBuild.reverse().toString();
        System.out.println(revString);
    }
}
