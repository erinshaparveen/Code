package Top_100_Question;

import java.util.Scanner;

public class practice_question_87 {
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
        traversing(array, row, column);
    }

    public static void traversing(int[][] arr, int row, int col)
    {
        int[] x_axis = {0,1,0,-1};
        int[] y_axis = {1, 0 ,-1 ,0};
        int i = 0 , j = 0 , dir = 0;
        while(row > i && i>=0 && j>=0 && col>j)
        {
            if(arr[i][j]==1)
            {
                arr[i][j]=0;
                dir = (dir+1)%4;
            }
            i = i+x_axis[dir];
            j = j+y_axis[dir];
        }
        i = i-x_axis[dir];
        j = j-y_axis[dir];
        System.out.println(i+" "+ j);
    }
}
