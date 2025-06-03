package Loops;
//Palindrome Checker
//Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backwards as forward.
//
//Note: Input number will not have any trailing zeros.
//
//Input
//The line inputs N.
//
//Output
//You need to print "true" if the number is palindrome otherwise "false" (without quotes).
//
//Example 1
//Input
//
//5
//Output
//
//true
//Example 2
//Input
//
//121
//Output
//
//true

import java.util.Scanner;

public class palindrom_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int actual_value = value;
        int reverse_number = 0;
        while(value>0)
        {
            reverse_number = reverse_number *10 + value%10;
            value = value/10;
        }
        if(reverse_number == actual_value)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
