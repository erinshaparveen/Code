package Top_100_Question;

import java.util.Scanner;

public class practice_question_71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        find_triplers(arr, length);
    }

    public static void find_triplers(int[] arr, int length)
    {
        for(int i = 0 ; i<length ;i++)
        {
            int first = arr[i];
            int second = 3*first;
            int third = 3* second;
            boolean second_found = false;
            boolean third_found = false;
            for(int j =i+1 ; j<length ;j++)
            {
                if(arr[j] == second)
                {
                    second_found = true;
                    break;
                }
            }
            if(second_found)
            {
                for(int j = i+1; j<length ;j++)
                {
                    if (arr[j] == third)
                    {
                        third_found = true;
                        break;
                    }
                }
            }
            if(second_found && third_found)
            {
                System.out.print(first+" "+second+" "+third);
            }
            System.out.println();
        }

    }
}
