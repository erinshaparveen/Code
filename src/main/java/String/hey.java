package String;

import java.util.Scanner;

//Example 1
//Input
//
//        hey
//Output
//
//        heey
public class hey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'e')
            {
                result.append("ee");
            }
            else {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
