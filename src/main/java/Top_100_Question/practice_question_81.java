package Top_100_Question;

import java.util.Scanner;

public class practice_question_81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i =0 ;i<length;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(maximum_occur_element(array, length));
    }
    public static int maximum_occur_element(int[] array , int length)
    {
        for(int i =0 ; i<length-1; i++)
        {
            for(int j = 0 ; j <length -1 ;j++)
            {
                if(array[j]<array[j+1])
                {
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] =temp;
                }
            }
        }
        int result = array[0];
        int max_occrance = 1;
        int current_count = 1;
        for(int i =1; i<length ;i++)
        {
            if(array[i]==array[i-1])
            {
                current_count++;
            }
            else {
                if(max_occrance<current_count)
                {
                    max_occrance = current_count;
                    result = array[i-1];
                    current_count = 1;
                }
            }
        }
        System.out.println(result);
        return max_occrance;
    }
}
