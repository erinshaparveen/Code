package Twenty_LPA;

import java.util.Scanner;

public class appendZeroInFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder strbuil= new StringBuilder();
        StringBuilder result = new StringBuilder();
        int z = 0;
        for(char ch : str.toCharArray())
        {
            if(ch == '0')
                z++;
            else
                strbuil.append(ch);
        }
        while(z>0)
        {
            result.append(0);
            z--;
        }
        result.append(strbuil);
        System.out.println(result.toString());
    }
}
