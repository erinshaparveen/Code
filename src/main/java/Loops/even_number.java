package Loops;

import java.util.Scanner;

//Print Even Numbers
//You are given an integer N. Your task to print all the even numbers from 0 to N.
//
//Input Format
//The input contains a single integer N.
//
//        Output Format
//Output all the even numbers from 0 to N.
//
//Example 1
//Input:
//
//        8
//Output:
//
//        0 2 4 6 8
//Example 2
//Input:
//
//        7
//Output:
//
//        0 2 4 6
public class even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int j=0;j<=range;j++)
        {
            if(j%2==0)
            {
                System.out.print(j + " ");
            }
        }
    }
}
