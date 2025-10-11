package Top_100_Question;

import java.util.Scanner;

public class practice_question_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        switch (ch)
        {
            case 'A':
                System.out.println("I am the first letter");
                break;
            case 'B':
                System.out.println("I am the Second letter");
                break;
            case 'C':
                System.out.println("I am the Third letter");
                break;
            case 'D':
                System.out.println("I am the Fourth letter");
                break;
            case 'E':
                System.out.println("I am the Fifth letter");
                break;
            default:
                System.out.println("I don't belong here");
                break;
        }
    }
}
