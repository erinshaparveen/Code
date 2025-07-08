package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Composite Numbers
//You are given an array A consisting of N integers. You have to remove all the composite numbers from the array.
//
//Note Complete the given function and print the updated array. The input and output would be handled by the driver code. You have to return the final arraylist.
//
//1 is neither prime nor composite.
//
//        Input Format
//The first line an integer N.
//
//The next line contains N integers.
//
//Output Format
//Return the updated arraylist.
//
//Example 1
//Input
//
//4
//        3 12 13 15
//Output
//
//3 13
//Explanation
//
//12 and 15 are composite, thus, they are removed.
public class remove_composite_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> list = non_composite_number_list(array, length);
        for(int val : list)
            System.out.print(val+" ");
    }

    public static ArrayList<Integer> non_composite_number_list(int[] array, int length)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < length ; i++)
        {
            int val = 2;
            boolean flag = true;
            while(val<=(array[i]/2))
            {
                if(array[i]%val == 0)
                {
                    flag = false;
                    break;
                }
                val++;
            }
            if(flag)
            {
                list.add(array[i]);
            }
        }
        return list;
    }
}
