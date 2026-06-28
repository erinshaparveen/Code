package DTDL;

import java.util.*;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {12,4,32,6,12,67,123,87,12,54, 5,6, 5};
        for(int i = 0 ; i <array.length-1 ;i++)
        {
            for(int j = i+1 ;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0 ; i <array.length ;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int top = 100;
        int bottom =10;
        while(bottom<=top)
        {
            System.out.print(top+" ");
            if(bottom<top)
                System.out.print(bottom+" ");
            top-=10;
            bottom+=10;
        }
        System.out.println();
        HashMap<Integer,Integer> map  =  new HashMap<>();
        List<Integer> list = List.of(323,43534,6765,323,2446,43534,6576,43534,324346);
        for(int num : list)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" -> "+entry.getValue()+" ");
        }
        int[] array1 = {2,3,3,65,21,65,21,21,12};
        int[] array2 = {43,12,5,68,23,76,23,76,23,67};
        int[] mergerResult = new int[array2.length+array1.length];
        System.arraycopy(array1, 0 ,mergerResult,0,array1.length);
        System.arraycopy(array2,0,mergerResult,array1.length,array2.length);
        Arrays.sort(mergerResult);
        for(int num: mergerResult)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        Stack<Integer> stck = new Stack<>();
        stck.push(54);
        stck.push(67);
        stck.push(32);
        stck.push(45);
        stck.push(13);
        stck.push(67);
        System.out.println(stck);
        System.out.println(stck.pop());
        System.out.println(stck.peek());

        int[] arrayMissed = {1,3,4,2,6,7};
        int lengthNum = arrayMissed.length+1;
        int cal = (lengthNum*(lengthNum+1))/2;
        int sum = 0 ;
        for(int i = 0 ; i < lengthNum-1 ;i++ )
        {
            sum+=arrayMissed[i];
        }
        System.out.println(cal-sum);
    }
}
