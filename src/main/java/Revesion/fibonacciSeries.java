package Revesion;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int first = 0;
        int second = 1;
        for(int  i = 0 ;i <= value; i++)
        {
            System.out.println(first);
            int third = first+second;
            first = second;
            second = third;

        }
    }
}
