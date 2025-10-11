package Nested_Loop;

import java.util.Scanner;

//Armstrong Number
//Write a program to print out all Armstrong numbers between 1 and N.
//
//A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.
//
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//
//Input Format
//The input contains a single integer representing N.
//
//Output Format
//Print all the Armstrong numbers from 1 to N in separate lines.
//
//        Example 1
//Input
//
//200
//Output
//
//        1
//        153
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i = 1; i <= range ;i++)
        {
            int sum = 0;
            int value = i;
             while(value>0)
             {
                 int val = value%10;
                 sum = sum + val*val*val;
                 value = value/10;
             }
             if(sum == i)
             {
                 System.out.println(i);
             }
        }

    }
}
