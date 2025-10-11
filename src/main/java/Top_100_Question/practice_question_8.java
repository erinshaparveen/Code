package Top_100_Question;

import java.util.Scanner;

public class practice_question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        int init_val = 0;
        int final_value = length-1;
        while(init_val<=final_value)
        {
            int temp = array[init_val];
            array[init_val] = array[final_value];
            array[final_value] = temp;
            init_val ++;
            final_value --;
        }
        for(int i = 0 ; i < length ; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
