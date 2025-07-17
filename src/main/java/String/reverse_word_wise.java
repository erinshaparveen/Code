package String;

import java.util.Scanner;

public class reverse_word_wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str_array = str.trim().split("\\s+");
        for(int i = str_array.length-1 ; i>=0 ; i--)
        {
            System.out.print(str_array[i]+" ");
        }

    }
}
