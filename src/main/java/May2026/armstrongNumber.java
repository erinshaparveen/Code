package May2026;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int prod = 0;
        int length = String.valueOf(num).length();
        while (temp>0)
        {
            int val = temp%10;
            prod = (int) (prod+Math.pow(val, length));
            temp/=10;
        }
        if(prod == num)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstromg");
        }

    }
}
