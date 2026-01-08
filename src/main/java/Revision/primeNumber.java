package Revision;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPrime(number)) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
    public static boolean isPrime(int number)
    {
        for(int i = 2 ;i <number/2-1; i++)
        {
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
