package Twenty_LPA;

import java.util.Scanner;

public class smallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 3, 5, 6,7 ,8 ,9 ,21, -44};
        int small = array[0];
        int lar = array [0];
        for(int i =1; i < array.length; i++)
        {
            if(array[i]<small)
                small = array[i];
            if(array[i]>lar)
                lar = array[i];
        }
        System.out.println(small+" "+ lar);
    }
}
