package Patterns;

import java.util.Scanner;

public class square_rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // No of Line
        int m = sc.nextInt();  // No of star
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
