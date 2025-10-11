package Function;
//Binary To Decimal
//Given binary representation of a number , convert it to decimal representation.
//
//Note : You just need to complete binaryToDecimal function.
//
//        Input Format
//Single line consisting of an integer n.
//
//        Output Format
//Print decimal representation of the number
//
//EXAMPLE 1
//Input:
//
//        111
//
//Output::
//        7

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(binary_decimal(val));
    }

    public static long binary_decimal(long val)
    {
        int base = 1;
        long dec_val = 0;
        while(val>0)
        {
            long num = val%10;
            val = val/10;
            dec_val = dec_val+num*base;
            base =base*2;
        }
        return dec_val;
    }
}
