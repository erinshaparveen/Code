package May2026;

public class addTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {3,5,7,9,3,1,4,7,9,0,2};
        int[] arr2 = {4,6,8,9,2,1,5,7,9,7,1};
        int arr1Length  = arr1.length-1;
        int arr2Length = arr2.length-1;
        int maxLength = Math.max(arr1.length,arr2.length);
        int[] sumOfArray = new int[maxLength+1];
        int borrow = 0;
        while(arr1Length>=0 || arr2Length>=0)
        {
            int sum = borrow;
            if(arr1Length>=0)
                sum+=arr1[arr1Length];
            if(arr2Length>=0)
                sum+=arr2[arr2Length];

            sumOfArray[maxLength] = sum%10;
            borrow = sum/10;

            arr1Length--;
            arr2Length--;
            maxLength--;

        }
        sumOfArray[0] = borrow;
        for(int i = 0 ; i< sumOfArray.length ; i++)
        {
            System.out.print(sumOfArray[i]+" ");
        }
    }
}
