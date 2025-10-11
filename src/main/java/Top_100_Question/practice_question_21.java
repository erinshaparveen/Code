package Top_100_Question;

import java.util.Scanner;

public class practice_question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] rev_str = str.trim().split("\\s");
        for(int i = rev_str.length-1; i>=0; i--)
        {
            System.out.print(rev_str[i]+" ");
        }
    }
}
