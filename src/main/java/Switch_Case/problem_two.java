package Switch_Case;

import java.util.Scanner;

//  Switch Case Problem 2
//  You are given a positive integer N. Write a program using switch case such that :
//
//        if user enters 12 , print "I am even",
//
//        if user enters 13 , print "I am prime",
//
//        if user enters 25 , print "I am odd",
//
//  Otherwise , print "I am just a number".
//
//  Input Format
//  First line contains an integer N.
//
//Output Format
//Print the sentence related to the integer as per description.
//
//Example 1
//Input
//
//25
//Output
//
//I am odd
//Example 2
//Input
//
//87
//Output
//
//I am just a number
public class problem_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch(value)
        {
            case 12:
                System.out.println("I am even");
                break;

            case 13:
                System.out.println("I am prime");
                break;

            case 25:
                System.out.println("I am odd");
                break;

            default:
                System.out.println("I am just a number");
                break;
        }
    }
}
