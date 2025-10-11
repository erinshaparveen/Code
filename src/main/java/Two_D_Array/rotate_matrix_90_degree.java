package Two_D_Array;

import java.util.Scanner;

//Rotate a Matrix by 90 Degree
//You are given a n x n 2-D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
//Input Format
//The first line will contain two integers n and n again.
//
//The next n lines contain n integers each representing the matrix.
//
//        Output Format
//Return a matrix that is rotated by 90 degrees in the clockwise direction.
//        Example 1
//        3 3
//        7  2  3
//        2  3  4
//        5  6  1
//Output
//
//5 2 7
//        6 3 2
//        1 4 3
public class rotate_matrix_90_degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // transpose
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        // rotation
        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = column-1;
            while(left<right)
            {
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;
                left++;
                right--;
            }
        }

        // Print the matrix
        for(int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
