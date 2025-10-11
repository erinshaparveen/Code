package Top_100_Question;

import java.util.Scanner;

public class practice_question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int range = sc.nextInt();
        if(range>1)
        {
            System.out.print(first +" " + second);
        }
        else
        {
            System.out.print(first + " ");
        }
        for(int i = 2 ; i<range ; i++)
        {
            int third = first+second;
            System.out.print(third + " ");
            first =second;
            second = third;
        }
    }
}
