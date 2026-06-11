package Coforge;

import java.util.Scanner;

public class ReplaceValueInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String replaced = str.replace(" ","-");
        System.out.println(replaced);
    }
}
