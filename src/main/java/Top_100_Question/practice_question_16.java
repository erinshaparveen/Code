package Top_100_Question;

import java.util.Scanner;

public class practice_question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int temp = val;
        int rev_val = 0;
        while(val>0)
        {
            rev_val = rev_val*10 + val%10;
            val = val/10;
        }
        System.out.println(rev_val);
    }
}
