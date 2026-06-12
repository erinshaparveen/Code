package May2026;

import java.util.Arrays;

public class MergeArrayInAsscendingOrder {
    public static void main(String[] args) {
        int[] arr1 = {1,3,54,76,8,5,34,234};
        int[] arr2 = {432,34243,65,768,978,2,1,12,5467};
        int[] result = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0, result,0, arr1.length);
        System.arraycopy(arr2, 0 ,result,arr1.length,arr2.length);
        Arrays.sort(result);
        for(int i = 0 ; i < result.length; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
