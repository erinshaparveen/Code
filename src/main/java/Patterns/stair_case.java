package Patterns;

import java.util.Scanner;

public class stair_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0; j<n-i ; j++)  // to print the space
            {
                System.out.print(" ");
            }
            for(int k=0; k<i ; k++)  // to print the pattern
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
