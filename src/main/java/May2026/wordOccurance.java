package May2026;

import java.util.HashMap;
import java.util.Map;

public class wordOccurance {
    public static void main(String[] args) {
        String str = "sdf fsdf fdsf dfds fsdf dsf dsf fds";
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: str.split(" "))
        {
            map.put(s, map.getOrDefault(s, 0 )+1);
        }
        for(Map.Entry<String,Integer> entry:  map.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
