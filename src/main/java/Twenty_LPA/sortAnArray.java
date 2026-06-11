package Twenty_LPA;

import java.util.Scanner;

public class sortAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int  i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i = 0 ; i < length - 1 ; i ++)
        {
            for(int j = i+1 ; j < length ; j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0 ; i <length ; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
