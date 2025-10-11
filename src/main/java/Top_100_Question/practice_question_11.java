package Top_100_Question;

import java.util.Scanner;

public class practice_question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int occur_num = sc.nextInt();
        System.out.println(frequency_of_number(number, occur_num));
    }
    public static int frequency_of_number(int num, int occur_num)
    {
        int frequency = 0;
        while(num>0)
        {
            int val = num%10;
            if(val == occur_num)
            {
                frequency++;
            }
            num = num/10;
        }
        return frequency;
    }
}
