package Top_100_Question;

import java.util.Scanner;

public class practice_question_59 {
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
        traversing(array, length);
    }

    public static void traversing(int[][]arr, int length) {
        for(int i = 0; i < length ; i++) {
            if(i%2 == 0)
            {
                for (int j = 0; j < length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for (int j = length-1; j >= 0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
