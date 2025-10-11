package Two_D_Array;
import java.util.Scanner;

//Spirally traversing a matrix
//Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.
//
//Input Format
//Input consists of two lines
//
//The first line contains two integers r and c which denotes number of rows and columns respectively.
//
//The next r lines contains c spaced integers, which are the elements of the matrix.
//
//Output Format
//Print the spiral matrix.
//
//Example 1
//Input
//
//4 4
//        1 2 3 4
//        5 6 7 8
//        9 10 11 12
//        13 14 15 16
//Output
//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
public class spirally_traversing {
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
            // left to right
            for(int i = left; i<=right; i++)
            {
                System.out.print(array[top][i]+" ");
            }
            top++;

            // top to bottom
            for(int i = top; i<=bottom; i++)
            {
                System.out.print(array[i][right]+" ");
            }
            right--;

            //right to left
            if(top <= bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(array[bottom][i]+" ");
                }
                bottom--;
            }

            //bottom to top
            if(left <= right)
            {
                for(int i = bottom; i>=top ; i--)
                {
                    System.out.print(array[left][i]+" ");
                }
                left++;
            }
        }
    }

}
