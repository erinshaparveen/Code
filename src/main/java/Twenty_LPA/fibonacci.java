package Twenty_LPA;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0)
        {
            System.out.println(0);
        }
        if(num == 1)
        {
            System.out.println(0 +" "+1);
        }
        else
        {
            int first = 0;
            int second = 1;
            for(int i = 0 ; i <num ;i ++)
            {
                System.out.print(first+" ");
                int third = first+second;
                first = second;
                second = third;
            }
        }
    }
}
