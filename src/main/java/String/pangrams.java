package String;

import java.util.Scanner;

public class pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(char i = 'a' ; i<='z' ; i++)
        {
            boolean flag = false;
            str = str.toLowerCase();
            for(int j = 0 ; j < str.length(); j++)
            {
                if(str.charAt(j) == i)
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
