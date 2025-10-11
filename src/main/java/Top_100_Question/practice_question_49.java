package Top_100_Question;

import java.util.Scanner;

public class practice_question_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        char ch =65;
        for(int i = 0 ; i < range ; i++)
        {
            int print_patter = ch+i;
            for(int j = 0 ; j <=i ; j++)
            {
                System.out.print((char)print_patter+" ");
                print_patter++;
            }
            System.out.println();
            if(ch==90)
            {
                ch = 65;
            }
        }
    }
}
