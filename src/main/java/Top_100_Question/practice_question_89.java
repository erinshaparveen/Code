package Top_100_Question;

import java.util.Scanner;

public class practice_question_89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for(int  i = 0 ; i < row ; i++)
        {
            for(int j = i +1; j < column ;j++)
            {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for(int i = 0 ; i < row ; i++)
        {
            int left = 0 ;
            int right = column-1;
            while(left<right)
            {
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
