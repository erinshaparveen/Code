package Top_100_Question;

import java.util.Scanner;

public class practice_question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        for(int i =2; i <=num ;i++)
        {
            sum =sum*i;
        }
        System.out.println(sum);
    }
}
