package Loops;

import java.util.Scanner;

//Print Digits
//Given the number n, print its digits starting from most significant digit to least significant digit.
//
//        Input Format
//Input consists of single line which has the integer n.
//
//Output Format
//print the digits of number one line at a time.
//
//Example 1
//Input
//
//1256
//Output
//
//        1
//        2
//        5
//        6
//Explanation
//
//Here, the digits are, 1,2,5,6.
//
//Example 2
//Input
//
//12345
//Output
//
//        1
//        2
//        3
//        4
//        5
public class print_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev_number = 0;
        while(number>0)
        {
            rev_number = number%10 + rev_number*10;
            number = number/10;
        }
        while(rev_number>0)
        {
            System.out.println(rev_number%10);
            rev_number = rev_number/10;
        }
    }
}
