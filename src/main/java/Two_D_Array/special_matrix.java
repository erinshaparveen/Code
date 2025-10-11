package Two_D_Array;

import java.util.Scanner;

//Special Matrix
//A square matrix is called special matrix if all the non-diagonal elements of the matrix are zero and the diagonal elements are non-zero.
//
//You are given a square matrix with N rows and columns. You have to check whether the given matrix is special or not. If the given matrix is special, true will be printed, else false.
//
//NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.
//
//Input Format:
//The first line contains the number of test cases t.
//
//For each test case: The first line contains N.
//
//The next N lines contain N integers each representing the elements of the matrix.
//
//Output Format:
//For each test case in t, output t lines true if the matrix is special else false
//
//Example 1:
//Input:
//        1
//        3
//        1 0 2
//        0 2 0
//        3 0 1
//Output:
//
//        true
public class special_matrix {
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
        System.out.println(special_matrix(array, length));
    }
    public static boolean special_matrix(int[][] array, int length)
    {
        boolean flag = true;
        for(int i = 0; i < length ; i++)
        {
            for(int j = 0 ; j < length ; j++)
            {
                if(i==j-1 || i==j+1)
                {
                    if(array[i][j]!=0){
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
}
