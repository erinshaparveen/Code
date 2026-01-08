package Revision;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int new_number = num;
        int size_pow = String.valueOf(num).length();
        int arm_num = 0;
        while(num>0)
        {
            int num_rem = num%10;
            arm_num = (int) (arm_num+Math.pow(num_rem, size_pow));
            num = num/10;
        }
        System.out.println(arm_num);
        if(arm_num == new_number) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
