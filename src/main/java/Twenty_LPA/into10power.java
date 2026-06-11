package Twenty_LPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class into10power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < str.length() ; i++)
        {
            int digit = str.charAt(i) - '0';
            int placeValue = (int)(digit*Math.pow(10,str.length()-i-1));
            list.add(placeValue);
        }
        System.out.println(list);
    }
}
