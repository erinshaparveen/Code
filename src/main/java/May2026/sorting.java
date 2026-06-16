package May2026;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        int[] array = {4,6,2,8,3,6,1,8,3,5,9,4};
//        Arrays.sort(array);
//        for(int num:array)
//            System.out.print(num+" ");
        for(int i = 0 ; i < array.length-1 ;i++)
        {
            for(int j = i+1 ; j < array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
            }
        }
        for(int num:array)
            System.out.print(num+" ");

    }
}
