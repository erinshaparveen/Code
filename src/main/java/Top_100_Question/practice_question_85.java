package Top_100_Question;

import java.util.Scanner;

public class practice_question_85 {
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
        traversing(array,row, column);
    }

    public static void traversing(int[][] arr, int row,  int col) {
        for(int i = 0 ;i < col ; i++)
        {
            System.out.print(arr[0][i]+" ");
        }
        for(int i = 1 ; i< row; i++)
        {
            System.out.print(arr[i][col-1]+" ");
        }
        if(col>1)
        {
            for(int  i = col-2 ; i>=0 ;i--)
            {
                System.out.print(arr[row-1][i]+" ");
            }
        }
        if(row>1)
        {
            for(int i = row-2;i>0; i--)
            {
                System.out.print(arr[i][0]+" ");
            }
        }
    }
}
