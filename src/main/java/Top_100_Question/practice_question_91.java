package Top_100_Question;

import java.util.Scanner;

public class practice_question_91 {
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

        int left = 0;
        int top = 0;
        int right = column-1;
        int bottom = row-1;
        while(left<=right && top<=bottom)
        {
            // left to right
            for(int i = left ;i<=right; i++)
            {
                System.out.print(array[top][i]+" ");
            }
            top++;

            // top to bottom
            for(int i =top ;i<=bottom ;i++)
            {
                System.out.print(array[i][right]+" ");
            }
            right--;

            // right to left
            if(top<=bottom)
            {
                for(int i =right; i>=left ;i--)
                {
                    System.out.print(array[bottom][i]+" ");
                }
                bottom--;
            }

            // bottom to top
            if(left<=right)
            {
                for(int i = bottom;i>=top;i--)
                {
                    System.out.print(array[i][left]+" ");
                }
                left++;
            }
        }
    }
}
