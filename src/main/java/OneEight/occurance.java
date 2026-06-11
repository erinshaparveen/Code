package OneEight;

import java.util.*;

public class occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < length ; i++)
        {
            map.put(array[i], map.getOrDefault(array[i], 0 )+1);
        }

        System.out.println(map);

    }
}
