package Twenty_LPA;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrimeNumber(num))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    public static boolean isPrimeNumber(int num)
    {
        if(num == 0 & num ==1)
            return true;
        else {
            for(int i = 2 ; i<=num/2 ; i++)
            {
                if(num%i==0)
                    return false;
            }
            return true;
        }
    }
}
