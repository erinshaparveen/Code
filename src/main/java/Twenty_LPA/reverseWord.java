package Twenty_LPA;

import java.util.Scanner;

public class reverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseOfString(str));
    }
    public static String reverseOfString(String str)
    {
        String[] strArray = str.split(" ");
        String revString = "";
        for(int i = 0 ; i < strArray.length ; i++)
        {
            String strWord = strArray[i];
            String revWord = "";
            char ch;
            for(int j = 0 ; j <strWord.length(); j++)
            {
                ch =  strWord.charAt(j);
                revWord = ch + revWord;
            }
            revString = revString + revWord + " ";
        }
        return revString;
    }
}
