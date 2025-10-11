package Top_100_Question;

import java.util.Scanner;

public class practice_question_88 {
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

        int min_val = Integer.MIN_VALUE;
        for(int i = 0 ; i <row ; i++)
        {
            int minimum_value = array[i][0];
            int col_Index = 0;
            for(int j = 0 ; j <column ;j++)
            {
                if(array[i][j] < minimum_value)
                {
                    min_val = array[i][j];
                    col_Index = j;
                }
            }
            boolean flag = true;
            for(int j = 0; j< row ;j++)
            {
                if(array[j][col_Index] > minimum_value)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                min_val  = minimum_value;
                break;
            }
        }
        System.out.println(min_val);
    }
}
