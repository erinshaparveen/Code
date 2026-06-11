package Twenty_LPA;

import java.util.Scanner;

public class digitNondigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder digit = new StringBuilder();
        int z = 0;
        for(char ch : str.toCharArray())
        {
            if(ch == '0')
                z++;
            else
                digit.append(ch);
        }
        while(z>0)
        {
            digit.append('0');
            z--;
        }
        System.out.println(digit.toString());
    }
}
