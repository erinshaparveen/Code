package May2026;

import java.util.ArrayList;
import java.util.Scanner;

public class temPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i)-'0';
            int item = (int)(val*Math.pow(10, str.length()-i-1));
            list.add(item);
        }
        System.out.println(list);
    }

}
