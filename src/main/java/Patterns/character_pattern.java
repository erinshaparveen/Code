package Patterns;

import java.util.Scanner;

//Print Character Pattern
//You are given a number N. Print a pattern consisting of N rows, where the first row has 1 A, the second row has 2 Bs, and so on for N letters. Check the examples for a better understanding.
//
//        Input Format
//First line of input contains N, the number of rows for the pattern
//Output Format
//You need to print the pattern.
public class character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int val = 65;
        for(int i = 0 ; i < range ; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)val);
            }
            val++;
            if(val>90)
            {
                val = 65;
            }
            System.out.println();
        }
    }
}
