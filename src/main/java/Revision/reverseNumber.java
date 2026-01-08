package Revision;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actual_number = sc.nextInt();
        int reverse_number = 0;
        while(actual_number>0)
        {
            reverse_number = reverse_number*10 + actual_number%10;
            actual_number = actual_number/10;
        }
        System.out.println(reverse_number);
    }
}
