package Top_100_Question;

import java.util.Scanner;

public class practice_question_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev_num = 0;
        int temp = number;
        while(number>0)
        {
            rev_num =rev_num*10 + number%10;
            number = number/10;
        }
        if(rev_num == temp)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
