package QA_Automation_Interview_Question;

import java.util.Scanner;

//Mathematical Operations
//You are given two positive integers. You have to calculate the result by performing +,-,*,/,% operations on them.
//
//        Input Format
//The first line of input contains two space-separated integers A and B.
//
//        Output Format
//The first line of the output should contain the sum of A and B.
//
//The second line of the output should contain the difference of A and B.
//
//The third line of the output should contain the product of A and B.
//
//The fourth line of the output should contain the quotient of A divided by B.
//
//The fifth line of the output should contain the remainder of A modulus by B.
public class mathematical_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);

    }
}
