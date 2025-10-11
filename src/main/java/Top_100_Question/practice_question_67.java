package Top_100_Question;

import java.util.Scanner;

public class practice_question_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i =0 ; i<range ; i++)
        {
            for(int j = 0; j <=i ;j++)
            {
                System.out.print(a+" ");
                int temp = b;
                b = a+b;
                a = temp;
            }
            System.out.println();
        }
    }
}
