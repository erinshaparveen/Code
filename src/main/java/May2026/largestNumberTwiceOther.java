package May2026;

public class largestNumberTwiceOther {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,9};
        int largest = 9;
        int index = 4;
        boolean flag = true;
        for(int i = 0 ; i < array.length ;i++)
        {
            if(i!=index)
            {
                if(!(array[i]*2<= largest))
                {
                    flag = false;
                }
            }
        }
        if(flag)
            System.out.println(index);
    }
}
