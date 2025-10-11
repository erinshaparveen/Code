package Top_100_Question;

import java.util.Scanner;

public class practice_question_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val_1 = sc.nextInt();
        int val_2 = sc.nextInt();
        int result = val_1%val_2;
        switch(result)
        {
            case 0:
                System.out.println("Remainder is too small");
                break;
            case 1:
                System.out.println("Remainder is small");
                break;
            case 2:
                System.out.println("Remainder is large");
                break;
            default:
                System.out.println("Remainder is too large");
        }
    }
}
