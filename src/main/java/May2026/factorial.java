package May2026;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 2; i<= num ;i++)
        {
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
