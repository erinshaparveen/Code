package May2026;

import java.util.*;

public class appendZeroInFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        StringBuilder nonZeroString = new StringBuilder();
        StringBuilder zeroString = new StringBuilder();
        while(num>0)
        {
            list.add(num%10);
            num/=10;
        }
        Collections.reverse(list);
        for(int i = 0 ; i <list.size();i++)
        {
            if(list.get(i)!=0)
            {
                nonZeroString.append(list.get(i));
            }
            else
                zeroString.append(list.get(i));
        }
        zeroString.append(nonZeroString);
        System.out.println(zeroString);
//        String str = sc.nextLine();
//        int z= 0;
//        for(int i = 0 ; i <str.length(); i++)
//        {
//            char ch = str.charAt(i);
//            if(ch == '0')
//            {
//                z++;
//            }
//            else
//            {
//                nonZeroString.append(ch);
//            }
//        }
//        while(z>0)
//        {
//            zeroString.append('0');
//            z--;
//        }
//        zeroString.append(nonZeroString);
//        System.out.println(zeroString.toString());
    }
}
