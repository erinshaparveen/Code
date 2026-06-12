package May2026;

import java.util.ArrayList;
import java.util.Scanner;

public class firstAndLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int length = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i<length ;i++)
        {
            int item = sc.nextInt();
            list.add(item);
        }
        System.out.println(list.get(0)+" "+list.get(list.size()-1));

    }
}
