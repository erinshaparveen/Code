package Top_100_Question;

import java.util.Scanner;

public class practice_question_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i =0 ;i<range ;i++)
        {
            int k =i+1;
            for(int j =0 ; j<=i;j++)
            {
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
