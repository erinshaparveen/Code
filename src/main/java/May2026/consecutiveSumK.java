package May2026;

public class consecutiveSumK {
    public static void main(String[] args) {
        int[] num = {3,4,5,6,2,3,4,5,6,3,4,5};
        int sum = 7;
        int count = 0;
        for(int i = 0 ; i<num.length-1; i++)
        {
            if(num[i]+num[i+1]==sum)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
