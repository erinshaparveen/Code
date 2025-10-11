package Top_100_Question;

import java.util.Scanner;

public class practice_question_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch>='a' && ch<='z') System.out.println(1);
        else if(ch>='A' && ch<='Z') System.out.println(0);
        else System.out.println(-1);
    }
}
