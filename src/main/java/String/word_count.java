package String;

import java.util.Scanner;

public class word_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str_array = str.trim().split("\\s+");

        System.out.println(str_array.length);
    }
}
