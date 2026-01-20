package Coforge;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1Length = sc.nextInt();
        int[] array1 = new int[array1Length];
        for(int i = 0 ; i < array1Length ; i++)
        {
            array1[i] = sc.nextInt();
        }

        int array2Length = sc.nextInt();
        int[] array2 = new int[array2Length];
        for(int i = 0; i< array2Length ; i++)
        {
            array2[i] = sc.nextInt();
        }

        int sumArrayLength = Math.max(array1Length, array2Length);
        int[] sumArray = new int[sumArrayLength];
        array1Length--;
        array2Length--;
        sumArrayLength--;
        int carry = 0;
        while(array1Length>=0 && array2Length>=0)
        {
            int sum = array1[array1Length]+array2[array2Length];
            sumArray[sumArrayLength] = (sum+carry)%10;
            carry = (sum+carry)/10;
            array1Length--;
            array2Length--;
            sumArrayLength--;
        }

        while(array1Length>=0)
        {
            sumArray[sumArrayLength] = (array1[array1Length]+carry)%10;
            carry =  (array1[array1Length]+carry)/10;
            array1Length--;
            sumArrayLength--;
        }

        while(array2Length>=0)
        {
            sumArray[sumArrayLength] = (array2[array2Length]+carry)%10;
            carry = (array2[array2Length]+carry)/10;
            array2Length--;
            sumArrayLength--;
        }

        for(int i = 0 ; i<sumArray.length ; i++) // never implement the loop condition based in the max length reason being nothing will print
        {
            System.out.println(sumArray[i]);
        }
    }
}
