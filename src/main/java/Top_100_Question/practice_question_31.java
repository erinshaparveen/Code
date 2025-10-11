package Top_100_Question;

import java.util.Scanner;

public class practice_question_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer str_bfr = new StringBuffer();
        for(int i = 0 ;i<str.length() ;i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                str_bfr.append(str.charAt(i));
            }
        }
        System.out.println(str_bfr);
    }
}
