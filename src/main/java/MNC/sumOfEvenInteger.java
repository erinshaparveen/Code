package MNC;

import java.util.Scanner;

public class sumOfEvenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for(int i=0; i<arrayLength; i++)
        {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j = 0; j<arrayLength; j++)
        {
            if(array[j]%2 == 0)
            {
                sum = sum+array[j];
            }
        }
        System.out.println(sum);

    }
}
