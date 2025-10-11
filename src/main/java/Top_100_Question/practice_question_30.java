package Top_100_Question;

import java.util.Scanner;

public class practice_question_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch>=65 && ch<=90) System.out.println("U");
        else System.out.println("L");
    }
}
