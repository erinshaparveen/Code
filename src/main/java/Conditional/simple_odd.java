package Conditional;
//        You are given two integers a and b. You need to perform the following operations
//
//        If both integers are odd, print `we are odd`.
//        Else print `we are simple`.
//        Input Format
//        First line contains two variables a and b.
//
//        Output Format
//        Output will be "we are odd" if both the variables are odd numbers. Otherwise output will be "we are simple".
//
//        Example 1
//        Input
//
//        1 3
//        Output
//
//        we are odd
//        Example 2
//        Input
//
//        2 5
//        Output
//
//        we are simple

import java.util.Scanner;

public class simple_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a%2==0 || b%2==0)
        {
            System.out.println("we are simple");
        }
        else
        {
            System.out.println("We are odd");
        }
    }
}
