package Coforge;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        StringBuilder strBuild = new StringBuilder();
        for(int i = strArray.length-1 ; i >=0  ;i--)
        {
            strBuild.append(strArray[i]+" ");
        }
        System.out.println(strBuild.toString());
    }
}
