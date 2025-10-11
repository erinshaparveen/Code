package Top_100_Question;

import java.util.Scanner;

public class practice_question_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ;i <length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max_sum = Integer.MIN_VALUE;
        int max_sum_value = 0;
        for(int num: arr)
        {
            max_sum_value =max_sum_value+num;
            if(max_sum_value>max_sum)
                max_sum = max_sum_value;
            if(max_sum_value<0)
                max_sum_value = 0;
        }
    }
}
