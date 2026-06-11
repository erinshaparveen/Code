package Twenty_LPA;

import java.util.HashSet;
import java.util.Scanner;

public class commomElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array  = new int[6];
        int[] array2 = new int[6];
        for(int i = 0 ; i < 6 ; i ++)
        {
            array[i]  = sc.nextInt();
        }
        for (int i = 0 ; i < 6 ; i++)
        {
            array2[i] = sc.nextInt();
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> commonSet = new HashSet<>();
        for(int i : array)
            set1.add(i);
        for(int  j : array2)
        {
            if(set1.contains(j))
                commonSet.add(j);
        }
        System.out.println(commonSet);
    }
}
