package Top_100_Question;

import java.util.Scanner;

public class practice_question_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] array = new int[length][length];
        for(int i = 0; i < length ; i++)
        {
            for(int j = 0 ; j < length ; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        diagonal_traversing(array, length);
    }
    public static void diagonal_traversing(int[][] array, int length)
    {
        for(int i = length-1 ;i>=0;i--)
        {
            int row = 0 ;
            int col = i;
            while(row<length && col<length)
            {
                System.out.print(array[row][col]+" ");
                row++;
                col++;
            }
        }
        for(int i = 1; i<length ;i++)
        {
            int row= i;
            int col = 0;
            while(row<length && col<length)
            {
                System.out.print(array[row][col]+" ");
                row++;
                col++;
            }
        }
    }
}
