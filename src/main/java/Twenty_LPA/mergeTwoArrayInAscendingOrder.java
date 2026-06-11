package Twenty_LPA;

import java.util.*;

public class mergeTwoArrayInAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {3,5,6,8,2,3,4,5};
        int[] array2 = {7,5,3,2,1,5,7,9,0};
        int[] mergesArray = new int[array1.length+array2.length];
        System.arraycopy(array1, 0 , mergesArray ,0,array1.length);
        System.arraycopy(array2, 0 , mergesArray,array1.length , array2.length);
        Arrays.sort(mergesArray);
        for(int  i = 0 ; i < mergesArray.length ; i++)
        {
            System.out.print(mergesArray[i]+" ");
        }
        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int  i = 0 ; i < mergesArray.length ; i++)
        {
            if(array1[1]<array2[i])
            {
                mergesArray[i] = array1[i];
            }
            else if (array1[i]>array2[i])
            {
                mergesArray[i] = array2[i];
            }
            else
            {
                if (i+1< mergesArray.length) {
                    mergesArray[i] = array2[i];
                    mergesArray[i + 1] = array2[i];
                    i++;
                }
            }
        }
        for(int  i = 0 ; i < mergesArray.length ; i++)
        {
            System.out.print(mergesArray[i]+" ");
        }

    }
}
