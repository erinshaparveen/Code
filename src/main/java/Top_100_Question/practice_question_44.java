package Top_100_Question;

import java.util.Scanner;

public class practice_question_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        for(int i = 2; i <= value ; i++)
        {
            boolean flag = true;
            for(int j = 2 ; j<=i/2 ;j++)
            {
                if(i%j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
            }
        }
    }
}
