package Function;

import java.util.Scanner;

//Lily wants to enter a positive integer and increase its value by 5 using for loop.
//
//She wants to increase the value in fun function & print the result in the caller function.
//
//Help Lily by writing a program for the same.
//
//Input Format
// First line contains an integer n
//
// Output Format
// Output will be (n+5)
public class add_5_in_the_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int add_5 = add_5_in_value(value);
        System.out.println(add_5);
    }

    public static int add_5_in_value(int val)
    {
        return val+5;
    }
}
