package Twenty_LPA;

import java.util.Scanner;

public class searchElementInArray {
    public static void main(String[] args) {
        int[] array = {1,3,3,4,5,6,7,8,9,13,5546,6867,123,46};
        int num = 13;
        for(int i = 0 ; i <array.length ; i++)
        {
            if(num == array[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
}
