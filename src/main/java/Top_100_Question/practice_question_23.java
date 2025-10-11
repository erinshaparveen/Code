package Top_100_Question;

import java.util.Scanner;

public class practice_question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max_element = Integer.MIN_VALUE;
        int second_max =Integer.MIN_VALUE;
        for (int i = 0 ; i < length ;i++)
        {
            if(arr[i]>max_element)
            {
                second_max = max_element;
                max_element = arr[i];
            }
            if (arr[i]>second_max && arr[i] != max_element)
            {
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }
}
