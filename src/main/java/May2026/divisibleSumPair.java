package May2026;

public class divisibleSumPair {
    public static void main(String[] args) {
        int[] num = {3,4,5,6,7,8,8 ,2,3,45,6,7,8,9};
        int count = 0 ;
        int tagert = 2;
            for(int j = 0;j<num.length-1 ;j++)
            {
                if((num[j]+num[j+1])%tagert ==0)
                {
                    count++;
                }
            }
        System.out.println(count);
    }
}
