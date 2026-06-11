package Twenty_LPA;

import java.util.Scanner;

public class remveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder strbuild = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i)!=' ')
                strbuild.append(str.charAt(i));
        }
        System.out.println(strbuild.toString());
    }
}
