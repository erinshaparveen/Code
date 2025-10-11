package Top_100_Question;

import java.util.Scanner;

public class practice_question_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0; i <row ;i++)
        {
            for(int j = 0; j<col ;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i <row ;i++) {
            boolean flag = false;
            for (int j = 0; j < col; j++) {
                if (array[i][j] == 1)
                {
                    flag =true;
                    break;
                }
            }
            if(flag)
            {
                for(int j = 0; j < col; j++)
                {
                    array[i][j] =1;
                }
            }
        }

        for(int i = 0; i <row ;i++)
        {
            for(int j = 0; j<col ;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
