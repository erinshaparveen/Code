package May2026;
import java.util.*;

public class characterCount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder strBuild = new StringBuilder();
        int count =1;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(i+1 < str.length() && str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else {
                strBuild.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(strBuild.toString());
    }
}
