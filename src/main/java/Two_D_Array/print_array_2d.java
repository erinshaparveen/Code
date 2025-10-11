package Two_D_Array;

import java.util.Scanner;

//Print 2D Array
//You are given 2D Array arr of size N x M, print the elements of it.
//
//        Input Format
//First line contains 2 space separated integers N and M, representing number of rows and columns respectively.
//
//Next N lines contains M space separated integers representing elements of the array arr.
//
//Output Format
//Elements of the array in N lines, where each line has M space separated integers.
//
//Example 1
//Input
//
//2 3
//        1 2 3
//        4 5 6
//Output
//1 2 3
//        4 5 6
public class print_array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for(int i = 0 ; i<row ; i++)
        {
            for(int j = 0 ; j < column ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        print_array(arr, row, column);
    }

    public static void print_array(int[][] arr , int row, int column) {
        for(int i = 0 ; i<row ; i++)
        {
            for(int j = 0 ; j < column ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
