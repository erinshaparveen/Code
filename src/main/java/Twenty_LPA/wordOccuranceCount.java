package Twenty_LPA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wordOccuranceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: str.split(" "))
        {
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String, Integer> entry: map.entrySet())
            System.out.println(entry.getKey()+"->"+entry.getValue());
    }
}
