package May2026;

public class building {
    public static void main(String[] args) {
        int[] num = {2,3,4,8,5,9,1,6,3,4};
        int largest = 9;
        for(int i = largest ;i>=1; i--)
        {
            for(int j = 0 ; j<num.length ;j++)
            {
                if(num[j]>=i)
                {
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
