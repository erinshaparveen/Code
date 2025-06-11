package Function;

import java.util.Scanner;

//Calculate nCr
//Given n and r, your task is to calculate nCr.
//
//Here nCr is the total number of ways for selecting r elements out of n options are nCr = (n!) / (r! * (n-r)!)  where n! = 1 * 2 * . . . * n.
//
//        Input Format
//Input consists of one line having two integers n followed by r.
//
//Output Format
//You have to calculate nCr using the formula as given and return the value to the main function.
//
//Example 1
//Input
//
//5 2
//Output
//
//10
//Example 2
//Input
//
//3 1
//Output
//
//3
public class calculate_nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nCr = nCr(n,r);
        System.out.println(nCr);

    }
    public static int nCr(int n, int r)
    {
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int n_r_factorial = factorial(n-r);
        int nCr = (n_factorial)/(n_r_factorial*r_factorial);
        return nCr;

    }
    public static int factorial(int val)
    {
        int prod = 1;
        for(int i=2;i<=val;i++)
        {
            prod = prod*i;
        }
        return prod;
    }
}
