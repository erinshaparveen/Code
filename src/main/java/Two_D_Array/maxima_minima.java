package Two_D_Array;

import java.util.Scanner;

//Maxima Minima
//Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column, if such an element does not exist return -1.
//
//Input Format
//First line contains the values n.
//
//Next n lines contain n spaced integers.
//
//        Output Format
//Return the element that is smallest in a row and largest in a column if not found return -1.
//
//Example 1
//Input
//
//2
//        1 3
//        6 5
//Output
//5
//Explanation
//
//Row 2 contains minimum element 5 that is largest in the 2nd column.
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
//7
public class maxima_minima {
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

        int min_val = -1;
        for (int i = 0; i < row; i++) {
            int min_row_value = array[i][0];
            int col_index = 0;

            // Find min in the row
            for (int j = 1; j < column; j++) {
                if (array[i][j] < min_row_value) {
                    min_row_value = array[i][j];
                    col_index = j;
                }
            }

            // Check if it's max in the column
            boolean flag = true;
            for (int k = 0; k < row; k++) {
                if (array[k][col_index] > min_row_value) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                min_val = min_row_value;
                break;
            }
        }

        System.out.println(min_val);
    }

}
