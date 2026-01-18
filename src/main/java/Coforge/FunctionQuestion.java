package Coforge;

import java.util.Scanner;

public class FunctionQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int value = sc.nextInt();
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int freNumber = sc.nextInt();
//        int frequency = sc.nextInt();
        int valueCheckerNumber = sc.nextInt();

//        System.out.println(add5More(number));
//        System.out.println(binaryToDecimal(value));
//        System.out.println(nCrFactorial(n,r));
//        System.out.println(nPr(n, r));
//        System.out.println(frequencyCount(freNumber, frequency));
        System.out.println(valueChecker(valueCheckerNumber));

    }

    public static String valueChecker(int value)
    {
        int count = 0;
        for(int i=0 ;i<=1;i++)
        {
            count = value%10;
            value = value/10;
        }
        if(count == 0)
            return "Yes";

        return "No";
    }
    public static int frequencyCount(int num, int frequency)
    {
        int count = 0;
        while(num>0)
        {
            int val = num%10;
            if(val == frequency)
                count++;
            num = num/10;
        }
        return count;
    }
    public static int nCrFactorial(int n, int r)
    {
        int nCr = factorial(n)/(factorial(n-r)*factorial(r));
        return nCr;
    }

    public static int nPr(int n, int r)
    {
        return factorial(n)/factorial(n-r);
    }

    public static int factorial(int num)
    {
        int fact =1;
        for(int i =2 ;i <= num ;i++)
        {
            fact = fact*i;
        }
        return fact;
    }


    // Add More Didgit
    public static int add5More(int value)
    {
        return value+5;
    }

    // Binary to decimal
    public static int binaryToDecimal(int value)
    {
        int base = 1;
        int decimalValue = 0;
        while(value>0)
        {
            int val = value%10;
            value = value/10;
            decimalValue = decimalValue+val*base;
            base = base*2;
        }
        return decimalValue;
    }
}
