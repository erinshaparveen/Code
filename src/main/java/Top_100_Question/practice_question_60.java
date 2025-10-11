package Top_100_Question;

import java.util.Scanner;

public class practice_question_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month)
        {
            case 4: case 6: case 9: case 12:
                System.out.println(30);
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 11:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
