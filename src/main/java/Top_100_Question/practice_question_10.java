package Top_100_Question;

import java.util.Scanner;

public class practice_question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int val_with_5_more = add_5(val);
        System.out.println(val_with_5_more);
    }

    public static int add_5(int val) {
        return val+5;
    }
}
