package Two_D_Array;

import java.util.Scanner;

//Boolean Matrix Problem
//You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
//
//Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to return the modified matrix.
//
//Your task is to complete the function BooleanMatrixProblem which takes m, n and the input array as the parameter and returns the modified matrix as specified in the question.
//
//Input Format
//The first line of contains m and n denoting number of rows and number of columns respectively.
//
//Then next m lines contain n elements each denoting the elements of the matrix.
//
//Output Format
//Return the modified matrix as specified above.
//
//        Example 1
//Input
//
//5 4
//        1 0 0 0
//        0 0 0 0
//        0 1 0 0
//        0 0 0 0
//        0 0 0 1
//Output
//
//1 1 1 1
//        0 0 0 0
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1
public class boolean_matrix_problem {
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

        for(int i=0; i<row; i++)
        {
            boolean flag = false;
            for(int j=0;j<column;j++)
            {
                if(array[i][j]==1)
                {
                    flag =true;
                }
            }
            if(flag)
            {
                for(int k=0;k<column;k++)
                {
                    if(array[i][k]!=1)
                    {
                        array[i][k]=1;
                    }

                }
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
