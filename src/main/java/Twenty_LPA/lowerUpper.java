package Twenty_LPA;

import java.util.Scanner;

public class lowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder loweCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for(char ch: str.toCharArray())
        {

            if(Character.isLowerCase(ch))
            {
                loweCase.append(ch);
            }
            else
                upperCase.append(ch);
        }
        System.out.println(loweCase+" "+upperCase);
    }
}
