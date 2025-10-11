package Top_100_Question;

import java.util.Scanner;

public class practice_question_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int val_2 = sc.nextInt();
        if(val%2 == 0 && val_2 % 2 == 0)
        {
            System.out.println("Simple");
        }
        else {
            System.out.println("Not");
        }
    }
}
