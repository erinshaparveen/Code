package Array;

import java.util.Scanner;

//Find Geometric Triplets
//Write a program to print all the triplets that form a geometric progression. All the elements of the array are in increasing order of their value.
//
//        Input Format
//Input consists of two lines.
//
//First line contains an integer N denoting size of array
//
//Second line contains N integers denoting the array elements separated by single space
//
//Output Format
//Print all the triplets that form a geometric progression, each in a new line. Print each geometric triplet in lexicographic form i.e. if a set of triplet has a lesser value at the same position compared to some other triplet then it has to be printed before the latter one.
//
//        Example 1
//Input
//6
//        1 2 6 10 18 54
//Output
//
//2 6 18
//        6 18 54
//Example 2
//Input
//
//8
//        2 8 10 15 16 30 32 64
//Output
//
//        2 8 32
//        8 16 32
//        16 32 64
public class geometric_tripler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++)
        {
            arr[i] = sc.nextInt();
        }
        geometric_tripler(arr, length);
    }

    public static void geometric_tripler(int[] arr, int length)
    {
        for(int i = 0 ; i < length ; i++)
        {
            int first = arr[i];
            int second = first*3;
            int third = second *3;
            boolean found_second = false;
            boolean found_third = false;
            for(int j = i+1 ; j < length ; j++)
            {
                if(arr[j] == second)
                {
                    found_second = true;
                    break;
                }
            }
            if(found_second)
            {
                for(int j = i+1 ; j < length ; j++)
                {
                    if(arr[j] == third)
                    {
                        found_third = true;
                        break;
                    }
                }
            }
            if(found_second && found_third)
            {
                System.out.println(first+" "+second+" "+third);
            }
        }
    }
}
