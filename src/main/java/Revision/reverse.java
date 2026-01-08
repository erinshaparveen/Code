package Revision;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  val_1 = sc.nextInt();
        int val_2 = sc.nextInt();
        val_1 = val_1 + val_2;
        val_2 = val_1 - val_2;
        val_1 = val_1 - val_2;
        System.out.println(val_1 + " " + val_2);
    }
}
