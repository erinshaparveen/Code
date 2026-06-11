package Twenty_LPA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
                System.out.println(entry.getKey() +"-->"+entry.getValue());
        }
    }
}
