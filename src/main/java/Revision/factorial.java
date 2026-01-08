package Revision;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextByte();
        int fact = 1;
        for(int i = 2 ; i<= val ;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
