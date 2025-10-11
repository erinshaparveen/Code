package Variable;

import java.util.Scanner;

//Verify Cube
//Take two positive integers from the user. Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.
//
//Calculate the Left hand side (LHS) and the right hand side (RHS) of the equation. Print the (LHS) and the (RHS).
//
//Print VERIFIED in uppercase if they are equal, otherwise print NOT VERIFIED.
//
//Input Format
//The first line contains two integers A and B.
//
//        Output Format
//Print two integers, the LHS and RHS in separate lines.
//
//Then print "VERIFIED" (without quotes and in uppercase) if they are equal, else print "NOT VERIFIED".
//
//Example 1
//Input:
//
//        4 5
//Output:
//
//        729
//        729
//VERIFIED
public class verify_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        int a_plus_b = a + b;
        int a_plus_b_cube = a_plus_b*a_plus_b*a_plus_b;
        int a_cube = a*a*a;
        int b_cube = b*b*b;
        int a_square = a*a;
        int b_square = b*b;
        int rhs = a_cube+b_cube+3*a_square*b+3*b_square*a;
        System.out.println(a_plus_b_cube+" "+ rhs);
        if(a_plus_b_cube==rhs) {
            System.out.println("Verified");
        }
        else
        {
            System.out.println("Non Verified");
        }
    }
}
