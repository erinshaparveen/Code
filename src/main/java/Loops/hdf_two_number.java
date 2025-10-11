package Loops;

import java.util.Scanner;

//HCF of two Numbers
//Given two number a and b, find their HCF.
//
//What Is HCF?
//
//HCF or Highest Common Factor is the greatest common divisor between two numbers.
//
//        Input Format
//The first line of input contains the integers a and b.
//
//        Output Format
//The output should be the hcf of a and b.
//
//Example 1
//Input
//
//75 90
//Output:
//        15
public class hdf_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a>0)
        {
            int temp = a;
            a = b%a;
            b = temp;
        }
        System.out.println(b);
    }
}
