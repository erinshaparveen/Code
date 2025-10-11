package Function;

import java.util.Scanner;

//CountFrequencyNumber
//Given a number N and a digit D. Write a program to find how many times the digit D appears in the number N.
//
//Input Format
//A single line containing the integers N and D.
//
//        Output Format
//Return a single integer representing the number of times the digit D appears in the number N.
//
//        Example 1
//Input
//
//   1111221 1
//   Output
//
//   5
public class count_frequency_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int frequency = sc.nextInt();
        int count = frequency(val,frequency);
        System.out.println(count);
    }

    public static int frequency(int val, int fre)
    {
        int count=0;
        while (val!=0)
        {
            int value = val%10;
            if(value == fre)
            {
                count++;
            }
            val=val/10;
        }
        return count;
    }
}
