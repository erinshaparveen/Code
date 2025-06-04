package Patterns;
//Print Number Pattern 2
//Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order. Check the sample cases for a better understanding.
//
//Input Format:
//Input consists of an integer N.
//
//Output Format:
//Print the pattern as described above.
//
//Example 1
//Input:
//
//        5
//Output:
//
//Pattern Image
//
//Example 2
//Input:
//
//        3
//Output::
//
//Pattern Image

import java.util.Scanner;

public class number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i = 0; i<range ; i++)
        {
            int k = i+1;
            for(int j =0 ;  j<=i ;j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
