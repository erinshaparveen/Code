package Top_100_Question;

import java.util.Scanner;

public class practice_question_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i =0 ; i<length ;i++)
        {
            array[i] = sc.nextInt();
        }
        selection_sort(array, length);
    }
    public static void selection_sort(int[] array, int length)
    {
        for(int i = 0 ; i <length ;i++)
        {
            for(int  j = i+1 ; j<length ;j++)
            {
                if(array[i]>array[j])
                {
                    if(i!=j)
                    {
                        int temp = array [i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    break;
                }
            }

        }
        for(int i = 0 ; i <length ;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
