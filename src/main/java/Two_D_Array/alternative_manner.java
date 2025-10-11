package Two_D_Array;

import java.util.Scanner;

//Alternate Manner Matrix Traversal
//Given a 2D matrix mat of M rows and N columns , the task is to print the 2D matrix in an alternate manner.
//
//Alternate manner denotes that the elements of the odd rows (first row, third row, etc) will be printed from left to right, and the elements of the even rows(second row, fourth row, etc.) will be printed from right to left.
//
//For example, if M=3, then the first line will contain all the elements of the first row of the matrix from left to right. The second line will contain all the elements of the second row from right to left. The third line will contain all the elements of the third row from left to right.
//
//Input Format
//The first line contains two integers, M and N, representing the number of rows and columns, respectively.
//
//The next M lines contain N space-separated integers, denoting the matrix.
//
//Output Format
//There will be 1 line with all the elements of the matrix after performing the alternate traversal. The elements will be separated by space.
//
//        Examples
//        Input
//
//2 2
//        1 2
//        2 3
//Output
//1 2 3 2
public class alternative_manner {
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

    // traversing
        for(int i = 0; i < row ; i++)
        {
            if(i%2==0)
            {
                for(int j =0 ; j < column ; j ++)
                {
                    System.out.print(array[i][j] + " ");
                }
            }
            else {
                for(int j = column-1 ; j >= 0 ; j --)
                {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
