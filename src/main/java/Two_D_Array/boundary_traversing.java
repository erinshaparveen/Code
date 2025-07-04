package Two_D_Array;

import java.util.Scanner;

//Boundary Traversal of matrix
//Given an m*n matrix, print the boundary traversal of the matrix in clockwise order.
//
//        Input Format
//First line contains the values m and n.
//
//Next m lines contain n-spaced integers.
//
//Output Format
//Print the boundary traversal of the matrix in clockwise order.
//
//Example 1
//Input
//
//2 3
//        1 2 3
//        1 5 3
//Output
//
//1 2 3 3 5 1
//Explanation
//
//We can see that while traversing in a clockwise fashion we go in the order of 1, 2, 3, 3, 5, 1.
//
//Example 2
//Input
//
//3 4
//        5 4 6 3
//        1 4 3 5
//        5 1 9 6
public class boundary_traversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for(int i = 0; i < row ; i++)
        {
            for(int j = 0 ; j < column ; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        traversing(array, row, column);
    }
    public static void traversing(int[][] array , int row, int column)
    {
        for(int i = 0 ; i < column; i ++)
        {
            System.out.print(array[0][i]+" ");
        }
        for(int j = 1 ; j < row ; j ++ )
        {
            System.out.print(array[j][column-1]+ " ");
        }
        if(column> 1)
        {
            for(int  i = column - 2 ; i>=0 ; i--)
            {
                System.out.print(array[row-1][i]+" ");
            }
        }
        if(row>1)
        {
            for(int j = row-2 ; j > 0 ; j --)
            {
                System.out.print(array[j][0]+" ");
            }
        }
    }
}
