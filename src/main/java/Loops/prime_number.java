package Loops;

import java.util.Scanner;

//Check Prime
//Write a program that inputs a positive integer N. It should then output a message indicating whether the number is a prime number or not.
//
//Input Format
//A single line containing the integer N
//
//Output Format
//Print a string, either "N is a prime number" or "N is not a prime number" (without quotes), depending on whether N is prime or not.
//
//Example 1
//Input
//
//5
//Output
//
//5 is a prime number
//Explanation
//
//5 is only divisible by itself and 1, hence it's a prime number.
//
//Example 2
//Input
//
//10
//Output
//
//10 is not a prime number
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        boolean flag = false;
        for(int j = 2 ; j < value/2 ; j++)
        {
            if(value%j == 0)
            {
                flag = true;
                System.out.println(value + " is not prime number");
                break;
            }
        }
        if(flag == false)
        {
            System.out.println(value + " is prime number");
        }
    }
}
