package Revision;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPalindrom(number)) System.out.println("Is Pelimdrom");
        else System.out.println("Not");
    }

    public static boolean isPalindrom(int number)
    {
        int orginal = number;
        int num = 0;
        while(number>0)
        {
            num = num*10+number%10;
            number =number/10;
        }
        System.out.println(num);
        if(num == orginal)
        {
            return true;
        }
        return false;
    }
}
