package DTDL;

public class maxSum {
    public static void main(String[] args) {
        int[] array = {-12,12,43,-45,8,9};
        int maxSum = Integer.MIN_VALUE;
        int result = 0;
        for(int num: array)
        {
            result+=num;
            if(maxSum<result)
                maxSum=result;
            if(result<0)
            {
                result = 0;
            }
        }
        System.out.println(maxSum);
    }
}
