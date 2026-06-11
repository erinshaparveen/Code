package Twenty_LPA;

import java.util.Scanner;

public class armstrong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arm = 0;
        int orgnum = num;
        int a;
        while(num>0)
        {
            a= num%10;
            num = num/10;
            arm = arm + a*a*a;
        }
        if(arm == orgnum)
            System.out.println("armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
