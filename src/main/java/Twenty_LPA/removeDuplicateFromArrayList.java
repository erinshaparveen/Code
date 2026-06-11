package Twenty_LPA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicateFromArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <20 ; i ++)
        {
            int num  = sc.nextInt();
            list.add(num);
        }
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> withoutDuplicate = new ArrayList<>(set);
        System.out.println(withoutDuplicate);
    }
}
