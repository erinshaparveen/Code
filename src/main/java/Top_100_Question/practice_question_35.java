package Top_100_Question;

import java.util.Scanner;

public class practice_question_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch(value)
        {
            case 12:
                System.out.println("I am even");
                break;

            case 13:
                System.out.println("I am prime");
                break;

            case 25:
                System.out.println("I am odd");
                break;

            default:
                System.out.println("I am just a number");
        }
    }

}
