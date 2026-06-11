package Twenty_LPA;

import java.util.Scanner;

public class missingNumberInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array =  new int[6];
        for(int i = 0 ; i < 6 ; i++)
        {
            array[i] = sc.nextInt();
        }
        int sum = (7*8)/2;
        int totalSum = 0;
        for(int num : array)
        {
            totalSum = num+totalSum;
        }
        System.out.println(sum-totalSum);
    }
}
