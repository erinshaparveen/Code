package Top_100_Question;

import java.util.Scanner;

public class practice_question_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(shorted_distance(arr, length ));
    }

    public static int shorted_distance(int[] arr, int length)
    {
        int previous_index =-1;
        int shortest_distance = Integer.MAX_VALUE;
        for(int i = 0 ; i <length ;i++)
        {
            if(arr[i]%2 == 0)
            {
                if(previous_index != -1)
                {
                    int shortest_value = i-previous_index;
                    shortest_distance = Math.min(shortest_distance, shortest_value);
                }
                else
                {
                    previous_index = i;
                }
            }
        }
        if(shortest_distance == Integer.MAX_VALUE)
        {
            return -1;
        }
        return shortest_distance;
    }
}
