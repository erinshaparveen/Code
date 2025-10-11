package Top_100_Question;

import java.util.Scanner;

public class practice_question_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i < val/2 ; i++)
        {
            if(val%i == 0)
            {
                System.out.println("Not Prime");
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Prime");
    }
}
