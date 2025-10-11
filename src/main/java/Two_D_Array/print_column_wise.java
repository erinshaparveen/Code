package Two_D_Array;

import java.util.Scanner;

//Print Matrix Column Wise
//Given a 2-D matrix A with N rows and M columns. Print the matrix in column-major order.
//
//Your task is to complete the function printMatrixColumnwise which receives the input matrix, N, and M as its parameters and prints the matrix in column major order.
//
//        Input Format
//The first line contains the number of test cases.
//
//For each test case: The first line contains two integers N and M denoting the number of rows and columns respectively.
//
//The next N lines contains M integers each denoting the elements of matrix A.
//
//Output Format
//For each test case print N*M space-separated integers, print the elements of the matrix column wise, in a single line.
//
//Example 1
//Input:
//
//        1
//        3 3
//        1 2 3
//        4 5 6
//        7 8 9
//Output:
//        1 4 7 2 5 8 3 6 9
public class print_column_wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
