package Top_100_Question;

import java.util.Scanner;

public class practice_question_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase =sc.nextInt();
        for(int i =1; i <=testCase ; i++)
        {
            int sum = 0;
            int val = i;
            while(val>0)
            {
                int digit = val%10;
                sum = sum+(digit*digit*digit);
                val = val/10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }

    }
}
