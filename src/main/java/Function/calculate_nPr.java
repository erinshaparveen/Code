package Function;

import java.util.Scanner;

//Calculate nPr
//Given 2 numbers n and r. Your task is to calculate nPr n!/(n-r)!.
//
//Input Format
//The first line of Input contains a single integer n.
//
//The second line of input contains a single integer r.
//
//Output Format
//Return the value of nPr.
//
//        Example 1
//Input
//
//5
//        2
//Output
//
//20
public class calculate_nPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_value = sc.nextInt();
        int r_value = sc.nextInt();
        int npr = nPr(n_value,r_value);
        System.out.println(npr);

    }
    public static int nPr(int n, int r)
    {
        return(factorial(n)/(factorial(n-r)));
    }
    public static int factorial(int value)
    {
        int prod = 1;
        for(int i=2 ; i<=value ;i++)
        {
            prod = prod*i;
        }
        return prod;
    }
}
