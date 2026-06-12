package May2026;

public class sumExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,12,1,2,4};
        int[] result = new int[arr.length];
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ;i++)
        {
            sum = sum+arr[i];
        }
        for(int j = 0 ; j < arr.length ; j++)
        {
            result[j] = sum - arr[j];

         }
        for(int i = 0 ; i < result.length ;i++)
        {
            System.out.print(result[i]+ " ");
        }
    }
}
