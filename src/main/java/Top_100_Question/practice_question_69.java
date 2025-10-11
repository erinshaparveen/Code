package Top_100_Question;

import java.util.Scanner;

public class practice_question_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int value = 65;
        for(int i = 0 ; i < range ;i++)
        {
            for(int j =0; j<=i ;j++)
            {
                System.out.print((char) value+" ");
            }
            value++;
            System.out.println();
            if(value>90)
            {
                value = 65;
            }
        }
    }
}
