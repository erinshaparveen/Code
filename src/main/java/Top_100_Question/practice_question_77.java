package Top_100_Question;

import java.util.Scanner;

public class practice_question_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_value = sc.nextInt();
        int r_value = sc.nextInt();
        System.out.println(nPr(n_value, r_value));
    }

    public static int nPr(int n, int r)
    {
        int n_fact = factorial(n);
        int n_minus_r_fact = factorial(n-r);
        return (n_fact/(n_minus_r_fact));
    }

    public static int factorial(int value)
    {
        int fact = 1;
        for(int i = 2 ; i<= value ;i++)
        {
            fact = fact * i;
        }
        return fact;
    }
}
