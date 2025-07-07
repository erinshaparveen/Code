package Two_D_Array;

import java.util.Scanner;

//Diagonal Traversal of a Matrix
//Give a N * N square matrix, return all the elements of its diagonals from top to bottom.
//
//Input Format
//First line contains N, representing the order of the 2D matrix.
//
//Next N lines contains N spaced elements each representing matrix elements.
//
//        Output Format
//Output in a sigle line, the Diagonal traversal of the matrix.
//
//The traversal should start from the top right of the matrix in bottom right direction and should continue upto bottom left.
//
//        Example 1
//Input
//
//2
//        1 2
//        3 4
//Output
//
//2 1 4 3
//Explanation:
//
//Topmost diagonal is [[2]]
//
//Next diagonal is [[1, 4]]
//
//and the last diagonal is [[3]]
//
//Example 2
//Input
//
//3
//        1 2 3
//        4 5 6
//        7 8 9
//Output
//
//3 2 6 1 5 9 4 8 7
public class diagonal_traversing {
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
        diagonal_traversing(array, length);
    }
    public static void diagonal_traversing(int[][] array , int length)
    {
        for(int i = length-1; i>=0 ; i--)
        {
            int row = 0;
            int col = i;
            while(row<length && col<length)
            {
                System.out.print(array[row][col]+ " ");
                row++;
                col++;
            }

        }

        for(int i = 1; i<length ;i++)
        {
            int row = i;
            int col = 0;
            while(row<length && col<length)
            {
                System.out.print(array[row][col]+ " ");
                row++;
                col++;
            }

        }
    }
}
