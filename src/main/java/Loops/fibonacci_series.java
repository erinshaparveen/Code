package Loops;
//Print Fibonacci Numbers
//You've to print first n Fibonacci numbers. Take as input n, the count of Fibonacci numbers to print.
//
//The Fibonacci Series is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.
//
//Print first n Fibonacci numbers.
//
//        Input Format
//The first line contains an integer n.
//
//        Output Format
//Print first n Fibonacci numbers.
//
//        Example 1
//Input
//
//10
//Output
//
//0
//        1
//        1
//        2
//        3
//        5
//        8
//        13
//        21
//        34
//Explanation
//
//The first 10 terms of the Fibonacci sequence are printed above.
//
//  Example 2
//  Input
//
//2
//  Output
//
//0
//        1

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int series_range = sc.nextInt();
        int a = 0;
        int b = 1;
        if(series_range >= 1)
        {
            System.out.println(a);
        }
        if(series_range >= 2)
        {
            System.out.println(b);
        }
        for(int i=2 ; i<series_range ; i++)
        {
            System.out.println(a+b);
            int temp = a;
            a = b;
            b = temp+b;
        }

    }
}
