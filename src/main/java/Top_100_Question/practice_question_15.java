package Top_100_Question;

import java.util.Scanner;

public class practice_question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0)
        {
            sum = sum*10 + num%10;
            num = num/10;
        }
        while(sum>0)
        {
            System.out.println(sum%10);
            sum =sum/10;
        }
    }
}
