package Top_100_Question;

import java.util.Scanner;

public class practice_question_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_col = sc.nextInt();
        int[][] array = new int[row_col][row_col];
        for(int i =0 ; i < row_col ;i++)
        {
            for(int j = 0 ; j < row_col ;j++)
            {
                array[i][j] =sc.nextInt();
            }
        }
        int lower_sum = 0 ;
        int upper_sum = 0;
        for(int i =0 ; i < row_col ;i++)
        {
            for(int j = 0 ; j < row_col ;j++) {
             if(i<=j)
             {
                 upper_sum =upper_sum+array[i][j];
             }
             if(i>=j)
             {
                 lower_sum =lower_sum+array[i][j];
             }
            }
        }
        System.out.println(lower_sum+" "+upper_sum);
    }
}
