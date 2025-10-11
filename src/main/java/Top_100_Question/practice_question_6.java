package Top_100_Question;

import java.util.Scanner;

public class practice_question_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int  i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0 ; i < length ; i ++)
        {
            if(array[i]>35)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
