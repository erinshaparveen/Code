package Top_100_Question;

import java.util.Scanner;

public class practice_question_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int a_plus_b = a+b;
        int a_plus_b_cube = a_plus_b*a_plus_b*a_plus_b;
        int a_square_b = a*a*b;
        int a_b_square = a*b*b;
        int a_cube = a*a*a;
        int b_cube = b*b*b;
        int lhs = a_cube+b_cube+3*a_square_b+3*a_b_square;
        if(a_plus_b_cube == lhs)
        {
            System.out.println("VERIFIED");
        }
        else
        {
            System.out.println("NOT");
        }
    }
}
