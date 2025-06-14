package Function;

import java.util.Scanner;

//Function Problem 2
//Write a program in which user will enter two positive integers and those two integers will be passed to another function fun.
//
//The fun function will perform the addition of the two and will print the output.
//
//        Note that, output will be printed inside fun function.
//
//Input Format
//First line contains two integers n and m.
//
//Output Format
//Print the sum of two integers.
public class sum_of_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value_1 = sc.nextInt();
        int value_2 = sc.nextInt();
        int sum = sum_of_value(value_1,value_2);
        System.out.println(sum);
    }

    public static int sum_of_value(int val_1, int val_2) {
        return val_1 + val_2;
    }
}
