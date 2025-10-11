package Two_D_Array;

import java.util.Scanner;

//Spiral Matrix 2
//You are given a matrix with N rows and M columns. You have to start iterating downwards on the first column and then continue spirally. Print an array containing the spiral of the matrix in the said manner.
//
//        NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.
//Input Format:
//The first line contains t: the number of test cases.
//
//For each test case: The first line contains N and M.
//
//The next N lines contain M integers each representing the elements of the matrix.
//
//Output Format:
//Print an array containing the spiral of the matrix in the said manner.
//
//        Example 1:
//Input:
//
//        1
//        3 3
//        1 4 7
//        2 5 8
//        3 6 9
//Output:
//
//        1 2 3 6 9 8 7 4 5
public class spiral_matrix_2 {
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

    public static void traversing(int[][] array, int row, int column)
    {
        int top = 0 , left = 0, bottom = column-1, right = row-1;
        while(top <= bottom && left <= right)
        {
            // top to bottom
            for(int i = top; i<=bottom; i++)
            {
                System.out.print(array[i][left]+" ");
            }
            left++;

            // left to right
            for(int i = left; i<=right; i++)
            {
                System.out.print(array[bottom][i]+" ");
            }
            bottom--;

            //bottom to top
            if(left <= right)
            {
                for(int i = bottom; i>=top ; i--)
                {
                    System.out.print(array[i][right]+" ");
                }
                right--;
            }

            //right to left
            if(top <= bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(array[top][i]+" ");
                }
                top++;
            }

        }
    }
}
