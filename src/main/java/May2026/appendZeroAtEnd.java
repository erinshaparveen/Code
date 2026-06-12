package May2026;

import java.util.*;

public class appendZeroAtEnd {
    public static void main(String[] args) {
        int val = 900300034;
        List<Integer> list = new ArrayList<>();
        StringBuilder zero = new StringBuilder();
        StringBuilder nionZero = new StringBuilder();
        int overallDigitr = 0;
        while (val > 0) {
            list.add(val % 10);
            val /= 10;
        }
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == 0)
            {
                zero.append(0);
            }
            else
            {
                nionZero.append(list.get(i));
            }
        }
        System.out.println(nionZero.append(zero));
    }
}
