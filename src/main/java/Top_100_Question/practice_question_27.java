package Top_100_Question;

import java.util.Scanner;

public class practice_question_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
