package Revision;

import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumOfDigit(number));
    }

    public static int sumOfDigit(int number)
    {
        int sum = 0;
        while(number>0)
        {
            sum = sum+number%10;
            number =number/10;
        }
        return sum;
    }
}
