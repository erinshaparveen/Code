package Top_100_Question;

import java.util.Scanner;

public class practice_question_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0 ; i< row; i++)
        {
            for(int j = 0 ;j<col ;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i< col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i]+" ");
            }
        }

    }
}
