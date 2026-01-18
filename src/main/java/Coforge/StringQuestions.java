package Coforge;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringQuestions {
    public static void main(String[] args) {
        //Sub String
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i = 0 ;i <str.length() ; i++)
        {
            for(int j = i+1 ; j<=str.length() ; j++)
            {
                System.out.print(str.substring(i,j)+" ");
                set.add(str.substring(i,j));
            }
        }
        System.out.println(set);

        //Aoutri
        String str2 = sc.nextLine();
        StringBuilder strbuild = new StringBuilder();
        for(int i = 0 ; i < str2.length() ; i++)
        {
            if(str2.charAt(i)>=65 && str2.charAt(i)<=90)
            {
                strbuild.append(str2.charAt(i));
            }
        }
        System.out.println(strbuild.toString());

        // hey
        String str3 = sc.nextLine();
        StringBuffer stingbuff = new StringBuffer();
        for(int  i = 0 ; i < str3.length() ; i++)
        {
            if(str3.charAt(i) == 'e')
            {
                stingbuff.append("ee");
            }
            else
            {
                stingbuff.append(str3.charAt(i));
            }
        }
        System.out.println(stingbuff.toString());

        //Lower Upper
        char ch = sc.nextLine().charAt(0);
        if(ch>=65 && ch<=90)
        {
            System.out.println("U");
        }
        else {
            System.out.println("L");
        }

        // Panageram string that contains all the alphabets
        String strPan = sc.nextLine();
        for(char i = 'a'; i<='z' ;i++)
        {
            boolean flag = false;
            for(int j = 0 ; j<strPan.length() ;j++)
            {
                if(strPan.charAt(j)==i)
                {
                    flag = true;
                    break;
                }
            }
            if(flag==false) {
                System.out.println("Not Panagran");
                return;
            }
        }
        System.out.println("Panagran");

        //Reverse the String
        String strRev = sc.nextLine();
        String[] atrArray = strRev.trim().split("\\s+");
        StringBuilder strReverse = new StringBuilder();
        for(int i = atrArray.length-1 ;i>=0 ;i--)
        {
            strReverse.append(atrArray[i]);
            strReverse.append(" ");
        }
        System.out.println(strReverse.toString().trim());

        // Word count
        String strWord = sc.nextLine();
        String[] strArray = strWord.trim().split("\\s+");
        System.out.println(strArray.length);
    }
}
