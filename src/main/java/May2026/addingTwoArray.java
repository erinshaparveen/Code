package May2026;

public class addingTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {3,2,4,4,1,7,3,8,6,5,4,3};
        int[] arr2 = {7,5,4,4,1,7,3,8,6,5,4,3};
        int[] result = new int[arr1.length+1];
        int first = arr1.length-1;
        int second = arr2.length-1;
        int resultLength = result.length-1;
        int borrow = 0 ;
        while(first>=0 || second>=0)
        {
            int sum = 0;
            sum+=borrow;
            if(first>=0)
                sum+=arr1[first];
            if(second>=0)
                sum+=arr2[second];
            result[resultLength] = sum%10;
            borrow = sum/10;
            first--;
            second--;
            resultLength--;
        }
        result[0] = borrow;
        for(int num : result)
        {
            System.out.print(num +" ");
        }
    }

}
