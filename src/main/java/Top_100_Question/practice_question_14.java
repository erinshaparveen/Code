package Top_100_Question;

import java.util.Scanner;

public class practice_question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val_1 = sc.nextInt();
        int value_2 = sc.nextInt();
        System.out.println(sum_of_number(value_2, val_1));
    }

    public static int sum_of_number(int val_1, int val_2)
    {
        return val_1+val_2;
    }
}
