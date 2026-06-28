package Twenty_LPA;

import java.util.ArrayList;
import java.util.Scanner;

public class firstAndLastElementOFArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int length = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < length ; i++)
        {
            String str = sc.nextLine();
            list.add(str);
        }
        System.out.println(list.get(0)+ " " + list.get(list.size()-1));

    }
}
