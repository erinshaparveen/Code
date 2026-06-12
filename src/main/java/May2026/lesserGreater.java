package May2026;

import java.util.Scanner;

public class lesserGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        for(int i = 0 ; i <str.length() ; i++)
        {
            if(i+1<str.length())
            {
                if(str.charAt(i)<str.charAt(i+1))
                    System.out.print('<'+" ");
                else if(str.charAt(i)>str.charAt(i+1))
                    System.out.print('>'+" ");
                else
                    System.out.print('='+" ");
            }
        }
    }
}
