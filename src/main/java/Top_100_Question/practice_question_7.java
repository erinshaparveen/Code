package Top_100_Question;

import java.util.Scanner;

public class practice_question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        int largest = array[0];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if(largest<array[i])
            {
                largest = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
