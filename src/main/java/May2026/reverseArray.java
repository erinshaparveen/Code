package May2026;

public class reverseArray {
    public static void main(String[] args) {
        int[] num = {23,54,76,12,325,6758,73,12,23,546,7};
        int init = 0 ;
        int last = num.length-1;
        while(init<last)
        {
            int temp = num[init];
            num[init] = num[last];
            num[last] = temp;
            init++;
            last--;
        }
        for(int val: num)
        {
            System.out.print(val+" ");
        }
    }
}
