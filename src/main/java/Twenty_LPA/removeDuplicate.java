package Twenty_LPA;

import java.util.Scanner;
import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        HashSet<Integer> set =  new HashSet<>();
        for(int num: array)
        {
            set.add(num);
        }
        int[] tempArray = new int[set.size()];
        int i = 0;
        for(int num : set)
        {
            tempArray[i] = num;
            i++;
        }
        for(int j = 0 ; j < set.size() ; j++)
        {
            System.out.print(tempArray[j]+ " ");
        }
    }
}
