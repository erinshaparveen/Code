package Top_100_Question;

import java.util.Scanner;

public class practice_question_70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i<length-1; i++)
        {
            for(int j = 0 ;j<length-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                   array[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i < length ; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
