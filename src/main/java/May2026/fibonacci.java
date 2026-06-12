package May2026;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = 0 ; int second = 1;
        if(num<=1)
        {
            System.out.print(first+ " ");
        }
        else
            for(int i = 1 ; i<=num ;i++)
            {
                System.out.print(first +" ");
                int third = first;
                first = second;
                second = second+third;
            }
    }
}
