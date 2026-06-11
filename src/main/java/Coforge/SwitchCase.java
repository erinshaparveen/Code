package Coforge;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.nextLine().charAt(0);
        System.out.println(letterPosition(letter));
    }

    public static String letterPosition(char letter)
    {
        switch(letter)
        {
            case 'A':
                return "First Position";
            case 'B':
                return "Second Position";
            case 'C':
                return "Third Position";
            case 'D':
                return "Fourth Position";
            default:
                return "Not belongs to here";
        }
    }
}
