package Top_100_Question;

import java.util.Scanner;

public class practice_question_78 {
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
        trnspose_matrix(array, row, column);
    }
    public static void trnspose_matrix(int[][] arr, int row, int col)
    {
        for(int i = 0 ; i<row;i++)
        {
            for(int j = i+1 ;j <col ;j++)

            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0 ; i<row;i++)
        {
            for(int j = 0 ; j <col ;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
