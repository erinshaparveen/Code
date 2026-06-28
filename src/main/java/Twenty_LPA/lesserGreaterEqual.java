package Twenty_LPA;

import java.util.*;


public class lesserGreaterEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        for(int i = 0 ; i < str.length()-1 ; i++)
        {
            char ch = str.charAt(i);
            if(ch>str.charAt(i+1))
                System.out.print(">");
            else if (ch<str.charAt(i+1))
            {
                System.out.print("<");
            }
            else
                System.out.print("=");
        }
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(num>0)
        {
            list.add(num%10);
            num = num/10;
        }
        Collections.reverse(list);
        for(int i = 0 ; i < list.size()-1 ;i++)
        {
            if(list.get(i)>list.get(i+1))
                System.out.print(">");
            else if(list.get(i)<list.get(i+1))
                System.out.print("<");
            else
                System.out.print("=");
        }
    }
}
