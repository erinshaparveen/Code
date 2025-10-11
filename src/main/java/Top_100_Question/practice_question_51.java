package Top_100_Question;

import java.util.Scanner;

public class practice_question_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0; i <row ;i++)
        {
            for(int j =0 ;j<col ;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        int blackSum = 0 ;
        int whiteSum = 0;
        for(int i =0 ;i <row; i++)
        {
            for(int j = 0; j<col ;j++)
            {
                if((i+j)%2 == 0)
                {
                    blackSum = blackSum+array[i][j];
                }
                else
                {
                    whiteSum = whiteSum + array[i][j];
                }
            }
        }
        System.out.println(blackSum +" "+whiteSum);
    }
}
