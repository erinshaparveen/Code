package Revision;

import java.util.Scanner;

public class revEchStringWrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverWordString(str));
    }

    public static String reverWordString(String str)
    {
        String reverseWord = "";
        String[] stringArray = str.split(" ");
        {
            for(int i = 0 ; i  < stringArray.length ; i ++)
            {
                String arrayWord = stringArray[i];
                char ch;
                String  revStr = "";
                for(int j = 0 ; j <arrayWord.length() ; j++)
                {
                    ch = arrayWord.charAt(j);
                    revStr = ch + revStr;
                }
                reverseWord = reverseWord + revStr +" " ;
            }
        }
        return reverseWord;
    }
}
