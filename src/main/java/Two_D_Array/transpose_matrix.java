package Two_D_Array;

import java.util.Scanner;

//Transpose of Matrix
//Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.
//
//Expected Time Complexity: O(N * N)
//
//Expected Space Complexity: Inplace
//
//Input Format
//The first line contains an integer N.
//
//The next N lines contains N spaced integers each, elements of matrix.
//
//        Output Format
//Print the transposed matrix.
//
//Example 1
//Input
//
//4
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
//Output
//1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
public class transpose_matrix {
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
        System.out.println();

    // Transpose
        for(int i = 0; i < row ; i++)
        {
            for(int j = i+1 ; j < column ; j++)
            {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for(int i = 0; i < row ; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(array[i][j] + " ");
                }
            System.out.println();
        }
    }

}
