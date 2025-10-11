package Two_D_Array;

import java.util.Scanner;

//Sum of upper and lower triangles
//Given a square matrix of size n*n, print the sum of upper and lower triangular elements.
//
//Upper Triangle consists of elements on the diagonal and above it.
//
//Lower triangle consists of elements on the diagonal and below it.
//
//        Note
//
//Diagonal here refers to the primary diagonal (starting at upper left corner and ending at bottom right corner).
//
//Your task is to complete the function triangleSums which receives n and input matrix as parameters and prints the sum of upper and lower triangles separated by space.
//
//Input Format
//First line contains the value 'n'.
//
//Next 'n' of each lines contain 'n' spaced integers.
//
//Output Format
//Print space separated sum of upper triangle followed by lower triangle.
//
//        Example 1
//Input
//
//3
//        1 2 3
//        1 5 3
//        4 5 6
//Output

//20 22
public class sum_upper_lower_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] array = new int[length][length];
        for(int i = 0; i < length ; i++)
        {
            for(int j = 0 ; j < length ; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        sum_of_triangle(array, length);
    }

    public static void sum_of_triangle(int[][] array , int length)
    {
        int upper_sum = 0;
        int lower_sum = 0;
        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length ; j++)
            {
                if(i<=j)
                {
                    upper_sum = upper_sum + array[i][j];
                }
                if(i>=j)
                {
                    lower_sum = lower_sum + array[i][j];
                }
            }
        }
        System.out.println(upper_sum + " " + lower_sum);
    }
}
