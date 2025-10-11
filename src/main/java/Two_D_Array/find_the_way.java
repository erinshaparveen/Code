package Two_D_Array;

import java.util.Scanner;

//Find The Way
//You are given a binary matrix of dimensions m*n. A mouse enters the matrix at cell (0,0) in left to right direction.
//
//He goes in the same direction if he encounters a 0 and he takes a right turn when he encounters a 1, and changes that specific 1 to 0.
// Otherwise he may get stuck in a cycle!
//
//You have to find the co-ordinates from where this mouse will exit the matrix.
//
//        Input Format
//First line contains the values m and n.
//
//Next m lines contain n spaced integers.
//
//        Output Format
//Return the co-ordinates from where this mouse will exit the matrix separated by space.
//
//Example 1
//Input
//
//1 2
//        0 0
//Output
//
//0 1
//Explanation
//
//The mouse will enter at (0,0) and keep going ahead and come out of (0,1).
//
//Example 2
//Input
//
//3 3
//        0 1 0
//        0 1 0
//        1 0 1
//Output
//
//1 0
public class find_the_way {
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
        way_index(array, row, column);
    }

    public static void way_index(int[][] array, int row, int column)
    {
        int[] x_axis = {0 , 1, 0 , -1};
        int[] y_axis = {1, 0 , -1 , 0};
        int i = 0, j = 0, dir = 0;
        while(row>i && i>=0 && j>=0 && column>j)
        {
            if(array[i][j]==1)
            {
                array[i][j] = 0;
                dir = (dir+1)%4;
            }
            i = i + x_axis[dir];
            j = j + y_axis[dir];
        }
        i = i - x_axis[dir];
        j = j - y_axis[dir];
        System.out.println(i + " " + j);
    }
}
