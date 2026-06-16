package Twenty_LPA;

import java.util.Scanner;

public class twiceEachLetter {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder strBuild = new StringBuilder();
        for(int i = 0 ; i <str.length();i++)
        {
            char ch =  str.charAt(i);
            if(ch == 'e')
            {
                strBuild.append(ch).append(ch);
            }
            else
            {
                strBuild.append(ch);
            }
        }
        System.out.println(strBuild.toString());
    }

}
