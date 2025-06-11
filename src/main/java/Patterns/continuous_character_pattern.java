package Patterns;
//Print Continuous Character Pattern
//Given an integer n that denotes the number of rows to be printed, print the pattern in which each row starts with its corresponding alphabet and has a length equal to the row number. (See the examples for a better understanding).
//
//Note: You can take the alphabet to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.
//
//        Input Format
//First line contains the value n representing the number of rows.
//
//        Output Format
//Print the pattern.
//
//        Example 1
//Input
//
//5
//Output
//
//
//
//Example 2
//Input
//
//8


import java.util.Scanner;

public class continuous_character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int character = 65;
        for(int i=0;i<range;i++)
        {
            int pattern_value = character+i;
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)pattern_value+" ");
                pattern_value++;
            }
            System.out.println();
        }
    }
}
