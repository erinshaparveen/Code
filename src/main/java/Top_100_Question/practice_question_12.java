package Top_100_Question;

import java.util.Scanner;

public class practice_question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(checker(value))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
    public static boolean checker(int val)
    {
        int count = 0;
        for(int i = 0 ; i<2 ;i++)
        {
            count = val%10;
            val = val/10;
        }
        if(count == 0)
        {
            return true;
        }
        return false;
    }
}
