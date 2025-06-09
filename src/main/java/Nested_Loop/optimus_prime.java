package Nested_Loop;

import java.util.Scanner;

//Optimus Prime
//Given an integer n, print all prime numbers between 1 and n (both inclusive).
//
//Example:
//
//        If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:
//
//        2
//        3
//        5
//        7
//Input Format
//The first line of the input contains one integer n.
//
//Output Format
//Your code should output all integers between 1 and n that are prime (both inclusive).
//
//Example 1
//Input:
//
//        8
//Output:
//
//        2
//        3
//        5
//        7
//Example 2
//Input:
//
//        13
public class optimus_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        for(int i = 2 ; i<value ;i++)
        {
            int val = i;
            boolean flag = false;
            for(int j=2 ;j<=val/2;j++)
            {
                if(val%j==0)
                {
                    flag = true;
                    break;
                }
            }
            if(flag!=true)
            {
                System.out.println(val);
            }
        }
    }
}
