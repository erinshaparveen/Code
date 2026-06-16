package May2026;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        int[] array = {2,3,4,6,7,98,12,2,34,56,7};
        int sum = 0 ;
        int maxx= array[0];
        for(int num:array)
        {
            if(num>maxx)
                maxx=num;
            sum+=num;
        }
        System.out.println(sum);
        int Average = sum/array.length;
        System.out.println(Average);
        System.out.println(maxx);
    }

}
