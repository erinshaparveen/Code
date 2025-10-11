package Top_100_Question;

import java.util.Scanner;

public class practice_question_58 {
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
        System.out.println(special_matrix(array,length));

    }

    public static boolean special_matrix(int[][] arr, int col)
    {
        boolean flag = true;
        for(int i = 0; i < col ; i++) {
            for (int j = 0; j < col; j++) {
                if( i== j+1 || i == j-1)
                {
                    if(arr[i][j] != 0)
                    {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
}
