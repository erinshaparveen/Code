package Twenty_LPA;

import java.util.Scanner;

public class palindrromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrom(str));
    }
    public static boolean isPalindrom(String str)
    {
        int low = 0;
        int high = str.length()-1;
        while(low<=high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
