package May2026;

import java.util.Scanner;

public class checkPrimenUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        else {
            for(int i = 2 ; i<=Math.sqrt(num);i++ )
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
