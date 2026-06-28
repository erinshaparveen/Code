package DTDL;
import java.util.*;

public class chracterOccurance {
    public static void main(StringQuestion[] args) {
        String str = "ughdfgfduigdfg";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<str.length();i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }

        List<Integer> list = List.of(12,344,5456,323,54,5456,24334,5456);
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int  i = 0 ; i< list.size(); i++)
        {
            map2.put(list.get(i), map2.getOrDefault(list.get(i), 0)+1);

        }
        for(Map.Entry<Integer, Integer> entryValue: map2.entrySet())
        {
            System.out.println(entryValue.getKey()+" -> "+entryValue.getValue());
        }

        Scanner sc = new Scanner(System.in);
        int num = 3;
        int first = 0 ;int second = 1;
        for(int i = 1; i <= num;i++)
        {
            System.out.print(first+" ");
            int third = first;
             first = second;
             second = first+third;
        }
        System.out.println();
        int[] array = {2,4,565,87,23,435,6,78,778,34,323,32};
        for(int i = 0 ; i <array.length ; i++)
        {
            if(array[i]%2==0)
            {
                System.out.print(array[i]+ " ");
            }
        }
        StringBuilder strbuild = new StringBuilder();
        String str2 = "My name is so and so";
        String strDash = str2.replace(' ', '-');
        System.out.println(strDash);
    }
}
