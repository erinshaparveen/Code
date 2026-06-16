package Twenty_LPA;

import java.util.Scanner;

public class seperateCharcterLetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder strLetter = new StringBuilder();
        StringBuilder strDigit = new StringBuilder();
        for(char ch : str.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                strLetter.append(ch);
            }
            else
                strDigit.append(ch);
        }
        System.out.println(strLetter+" "+strDigit);
    }
}
