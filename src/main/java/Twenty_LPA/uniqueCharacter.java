package Twenty_LPA;

import java.util.Scanner;

public class uniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        uniqueCharacterValue(str);
    }
    public static void uniqueCharacterValue(String str)
    {
        boolean[] unique = new boolean[128];
        for(char ch : str.toCharArray())
        {
            if(!unique[ch])
            {
                unique[ch]=true;
                System.out.print(ch+" ");
            }
        }
    }
}
