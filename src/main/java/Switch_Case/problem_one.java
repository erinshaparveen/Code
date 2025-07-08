package Switch_Case;

import java.util.Scanner;

//Switch Case Problem 1
//You are given a positive integer N. Write a program using switch case to print the following output such that :
//
//If the case is 55 , print "Study is important" ,
//
//Otherwise , print "No value" .
//
//Input Format
//First line contains an integer N.
//
//Output Format
//Print the sentence related to the integer as per description.
//
//Example 1
//Input
//
//55
//Output
//
//Study is important
//Example 2
//Input
//
//24
//Output
//
//No value
public class problem_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch(value){
            case 55:
                System.out.println("Study is important");
                break;
            default:
                System.out.println("No value");
                break;
        }
    }
}
