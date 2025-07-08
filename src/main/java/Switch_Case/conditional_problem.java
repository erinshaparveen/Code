package Switch_Case;

import java.util.Scanner;

//Conditional Problem 4
//You are given a letter of English alphabets. Write a program using switch case to print the following outputs for different inputs as :
//
//If input is 'A' , print "I am the first letter",
//If input is 'B' , print "I am the second letter",
//If input is 'C' , print "I am the third letter",
//If input is 'D' , print "I am the fourth letter",
//If input is 'E' , print "I am the fifth letter",
//For any other input character, print "I don't belong here".
//        Note that, Input characters will only be Capital Letters.
//
//Input Format
//First line contains a character
//
//Output Format
//Return the sentence related to the character as per description.
//
//Example1
//        Input
//
//A
//        Output
//
//I am the first letter
public class conditional_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'A':
                System.out.println("I am the first letter");
                break;
            case 'B':
                System.out.println("I am the second letter");
                break;
            case 'C':
                System.out.println("I am the third letter");
                break;
            case 'D':
                System.out.println("I am the fourth letter");
                break;
            case 'E':
                System.out.println("I am the fifth letter");
                break;
            default:
                System.out.println("I don't belong here");
                break;
        }
    }
}
