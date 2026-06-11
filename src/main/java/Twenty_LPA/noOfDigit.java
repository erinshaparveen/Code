package Twenty_LPA;

import java.util.Scanner;

public class noOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a= 0;
        if(num<0)
            num=num*-1;
        if(num == 0)
            num =1;
        while(num>0)
        {
            num = num/10;
            a++;
        }
        System.out.println(a);
    }
}
