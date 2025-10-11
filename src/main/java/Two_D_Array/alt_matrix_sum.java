package Two_D_Array;

import java.util.Scanner;

//Alt Matrix Sum
//You are given a chessboard of size N x N, where the top left square is black. Each square contains a value. Find the sum of the values of all black squares and all white squares.
//
//Remember that in a chessboard, black and white squares are alternate.
//
//Input Format
//The first line contains N, the size of a row of the square matrix.
//
//The next N lines contain N space-separated integers each.
//
//        Output Format
//Print two lines, the first line containing the sum of black squares and the second line containing the sum of white squares.
//
//        Example 1
//Input
//
//3
//        1 2 3
//        4 5 6
//        7 8 9
//Output
//
//          25
//        20
public class alt_matrix_sum {
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

        int black_sum = 0 ;
        int white_sum = 0;
        for (int i = 0; i < length; i++)
        {
            for(int j = 0 ; j < length ; j++)
            {
                if((i+j)%2==0)
                {
                    black_sum+=array[i][j];
                }
                else
                {
                    white_sum+=array[i][j];
                }
            }
        }
        System.out.println(black_sum);
        System.out.println(white_sum);
    }
}
