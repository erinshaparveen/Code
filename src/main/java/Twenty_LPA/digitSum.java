package Twenty_LPA;

import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfDigit(num));
    }

    public static int sumOfDigit(int num)
    {
        int sum = 0;
        if (num == 0)
            return 0;
        while(num>0)
        {
            sum = sum+ num%10;
            num = num/10;
        }
        return sum;
    }
}
