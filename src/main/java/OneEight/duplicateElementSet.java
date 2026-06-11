package OneEight;

import java.util.*;
import java.util.Scanner;

public class duplicateElementSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0; i<length ; i++)
        {
            array[i] = sc.nextInt();
        }
        Set<Integer> stored = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int num: array)
        {
            if(!stored.add(num))
            {
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);

    }
}
