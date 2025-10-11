package Top_100_Question;

import java.util.Scanner;

public class practice_question_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long decimal = sc.nextLong();
        int base = 1;
        long sum_dec = 0;
        while(decimal>0)
        {
            long val = decimal%10;
            sum_dec =sum_dec + val*base;
            decimal = decimal/10;
            base =base*2;
        }
        System.out.println(sum_dec);
    }
}
