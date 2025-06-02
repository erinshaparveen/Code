package Conditional;

import java.util.Scanner;

//Number of Days
//Given the number of the month, your task is to calculate the number of days present in the particular month.
//
//        Note:- Consider non-leap year.
//
//Input Format
//An integer M, denoting the number of the month.
//
//Output Format
//Return the number of days in the month corresponding to the given number. Consider a non-leap year.
//
//Example 1
//Input
//
//1
//Output
//
//31
//Explanation
//
//January has 31 days.
//
//        Example 2
//Input
//
//3
//Output
//
//31
public class day_in_a_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day;
        switch (month){
            case 6: case 11: case 4: case 12:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            case 1: case 3: case 5: case 7: case 8: case 9: case 10:
                System.out.println(31);
                break;
        }


    }
}
