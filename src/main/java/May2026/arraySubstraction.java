package May2026;

public class arraySubstraction {
    public static void main(String[] args) {
        int[] arr1 = {6,4,3,2,1,3,4,5,6,7,8,9,0,2};
        int[] arr2 =   {4,3,2,1,3,4,5,6,7,8,9,0,2};
        int[] result = new int[arr1.length];
        int first = arr1.length-1;
        int second = arr2.length-1;
        int resultLength = first;
        int carray = 0;
        while(first>=0)
        {
            int top = arr1[first]+carray;
            int bottom = second>=0? arr2[second]:0 ;
            if(top<bottom)
            {
                top+=10;
                carray = 1;
            }
            else
                carray = 0;
            result[resultLength] = top-bottom;
            resultLength--;

            first--;
            second--;
        }
        for(int num: result)
        {
            System.out.print(num+" ");
        }
    }
}
