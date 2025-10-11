package Top_100_Question;

import java.util.Scanner;

public class practice_question_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a>0)
        {
            int temp =a;
            a = b%a;
            b=temp;
        }
        System.out.println(b);
    }
}
