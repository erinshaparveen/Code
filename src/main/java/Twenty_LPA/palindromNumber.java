package Twenty_LPA;

import java.util.Scanner;

public class palindromNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPlindrom(num))
            System.out.println("Palindrom");
        else
            System.out.println("Not Palindrom");
    }
    public static boolean isPlindrom(int num)
    {
        int orginalNum = num;
        int rev = 0;
        if(num==0)
            return true;
        else
            while(num>0)
            {
                rev = rev*10+num%10;
                num=num/10;
            }
        return rev == orginalNum;
    }
}
