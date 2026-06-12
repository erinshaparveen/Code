package May2026;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int sum = 0;
        for(int i = 0 ; i <arr.length;i++)
        {
            sum+=arr[i];
        }
        int total = arr.length+1;
        int sumTotal = (total*(total+1))/2;
        System.out.println(sumTotal-sum);
    }
}
