package Top_100_Question;

import java.util.Scanner;

public class practice_question_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i = 0 ; i < range ;i++)
        {
            for(int j =0 ; j<i;j++)
            {
                System.out.print("*");
            }
            for(int j = 0 ;j<range-i;j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
