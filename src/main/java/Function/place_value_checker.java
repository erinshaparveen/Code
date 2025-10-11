package Function;

import java.util.Scanner;

//Place Value Checker
//Given a positive integer N. The task is to Create a function and return true or false according to the condition that whether zero is present at the second last place value or not.
//
//You have to print the output in the calling function itself based on the boolean value you get in return from the function.
//
//The output should be Yes or No.
//
//        Input Format
//Input consists of a single line of integer n.
//
//        Output Format
//Print Yes if the second last place value is 0 else No.
//
//        EXAMPLE 1
//  Input:
//
//        100
//  Output::
//
//  Yes
public class place_value_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        boolean output = value_Checker(value);
        if(output)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
    public static boolean value_Checker(int val)
    {
        int count = 0;
        for(int i =0 ;i<2;i++)
        {
            count =val%10;
            val = val/10;
        }
        if(count==0)
        {
            return true;
        }
        return false;
    }
}
