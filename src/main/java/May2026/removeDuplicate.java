package May2026;

import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,2,3,5,6,8,3,4,5};
        HashSet<Integer> set = new HashSet<>();
        for(int num: array)
        {
            set.add(num);
        }
        int i = 0;
        int[] result = new int[set.size()];
        for(int num:set)
        {
            result[i] = num;
            i++;
        }
        for(int j = 0 ; j <result.length ;j++)
        {
            System.out.print(result[j]+" ");
        }

    }
}
