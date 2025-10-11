package Top_100_Question;

import java.util.Scanner;

public class practice_question_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag)
        {
            int val = sc.nextInt();
            if(val%2 != 0)
            {
                flag =false;
            }
        }
    }
}
