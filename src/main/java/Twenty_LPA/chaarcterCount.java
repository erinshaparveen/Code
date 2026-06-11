package Twenty_LPA;

import java.util.Scanner;

public class chaarcterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder strbuild = new StringBuilder();
        int count = 1;
        for(int i = 0 ; i < str.length();i++)
        {
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1))
                count++;
            else
            {
                strbuild.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        System.out.println(strbuild.toString());
    }

}
