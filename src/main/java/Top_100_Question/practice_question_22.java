package Top_100_Question;

import java.util.Scanner;

public class practice_question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word_str = str.trim().split("\\s");
        System.out.println(word_str.length);
    }
}
