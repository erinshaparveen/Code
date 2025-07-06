package Two_D_Array;

import java.util.Scanner;

//Toeplitz Matrix
//Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
//
//A matrix is Toeplitz if every diagonal from left to right has the same elements.
//
//Input Format
//First line contains two integers, m and n which define the row and column size of the matrix respectively.
//
//Next each of 'm' lines contain 'n' space separated integers that denote the matrix elements.
//
//Output Format
//Return true if a matrix is Toeplitz Matrix, else return false.
//
//Example 1
//Input
//
//3 4
//        1 2 3 4
//        5 1 2 3
//        9 5 1 4
//Output
//
//false
//Explanation
//
//Every diagonal from left to right doesn't have the same value. (2,2,4) diagonal is where it becomes false.
//
//Example 2
//Input
//
//2 3
//        3 7 3
//        5 3 7
//
//Output
//
//true
public class toeplitz_matrix {
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
        System.out.println(toeplitz(array , row , column));
    }

    public static boolean toeplitz(int[][] array , int row, int column)
    {
        boolean flag = true;
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < column ; j++)
            {
                if(i == j && i != 0)
                {
                   if(array[i][j] !=array[i-1][j-1])
                   {
                       flag = false;
                   }
                }
                if( i == (j-1) && i != 0)
                {
                    if(array[i][j] !=array[i-1][j-1])
                    {
                        flag = false;
                    }
                }
                if( i == (j+1) && i != 0 && j>column-1)
                {
                    if(array[i][j] !=array[i-1][j-1])
                    {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
}
