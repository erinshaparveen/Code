package Array;

import java.util.Scanner;

//Array Problem 2
//Write a program to count the elements in an array which are greater than 35.
//
//Input Format:
//First line contains n, the size of an array.
//
//Next line contains n-spaced integers representing array arr.
//
//Output Format:
//Print the number of the elements present in the array which are greater than 35.
//
//Example 1
//Input
//
// 5
//        12 67 89 16 23
// Output
//
// 2
public class greater_than_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int[] array = new int[array_length];
        for(int index = 0; index < array_length ;index++)
        {
            array[index] = sc.nextInt();
        }
        System.out.println(number_count(array, array_length));
    }

    public static int number_count(int[] array, int length)
    {
        int count = 0;
        for(int i=0; i<length ; i++)
        {
            if(array[i]>35)
            {
                count++;
            }
        }
        return count;
    }
}
