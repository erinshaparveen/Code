package May2026;

import java.util.*;

public class arraysCommomElement {
    public static void main(String[] args) {
        int[] arr1 = {3,5,7,9,2,4,5,8,0,12,12};
        int[] arr2 = {1,43,4,7,0,56,465,312,12};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> commonElement = new HashSet<>();
        for(int num : arr1)
        {
            set.add(num);
        }
        for(int num: arr2)
        {
            if(set.contains(num))
            {
                commonElement.add(num);
            }
        }
        System.out.println(commonElement);
    }
}
