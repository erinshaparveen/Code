package String;

import java.util.Scanner;

//Input
//
//Knuth-Morris-Pratt
//        Output
//
//KMP
public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer orgString =new StringBuffer();
        for(int i =0 ;i<str.length(); i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                orgString.append(str.charAt(i));
            }
        }
        System.out.println(orgString.toString());
    }
}
