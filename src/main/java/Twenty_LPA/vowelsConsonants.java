package Twenty_LPA;

import java.util.Scanner;

public class vowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        String str = sc.nextLine();
        int vawel = 0;
        int consonants =0;
        str = str.toLowerCase();
        for(char ch : str.toCharArray())
        {
            if(ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch=='u')
                {
                    vawel++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println(vawel+"  "+consonants);
    }
}
