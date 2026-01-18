package MNC;

import java.util.*;

public class dublicateElemenfDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for(int i =0 ; i < arrayLength ;i ++)
        {
            array[i] = sc.nextInt();
        }
        removeDuplicate(array, arrayLength);
    }
    public static void removeDuplicate(int[] array, int arrayLength)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i = 0 ;i <arrayLength ; i++)
        {
            set.add(array[i]);
        }
        System.out.println(set);
    }
}
