package Top_100_Question;

import java.util.Scanner;

public class practice_question_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        float farenhite = celcius*(9/5)+32;
        System.out.printf("%.6f",farenhite);
    }
}
