package Twenty_LPA;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permutationString(str, "");
    }
    public static void permutationString(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String rem = str.substring(0,i)+str.substring(i+1);
                permutationString(rem, ch+ans);
            }
        }
    }
}
