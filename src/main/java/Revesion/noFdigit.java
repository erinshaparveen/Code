package Revesion;

import java.util.Scanner;

public class noFdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if(number<0)
            number = number*-1;
        else if(number == 0)
        {
            number = 1;
        }
        while (number>0)
        {
            number = number/10;
            count++;
        }
        System.out.println(count);
    }
}

