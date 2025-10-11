package Top_100_Question;

import java.util.Scanner;

public class practice_question_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(char i = 'a' ; i<='z' ; i++)
        {
            boolean flag = false;
            for(int j = 0; j<str.length() ; j++)
            {
                if(str.charAt(j) == i)
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
