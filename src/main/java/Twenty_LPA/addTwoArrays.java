package Twenty_LPA;

public class addTwoArrays {
    public static void main(String[] args) {
        int[] array1 =   {3,5,7,7,2,1,2,6};
        int[] array2 = {5,4,2,1,6,9,0,3,1};
        int carry = 0;
        int maxlength = Math.max(array1.length, array2.length);
        int k = maxlength;
        int[] sumOfArray = new int[maxlength+1];
        int array1Length = array1.length-1;
        int array2Length = array2.length-1;
        while(array1Length>=0 || array2Length>=0)
        {
            int sum  = carry;
            if(array1Length>=0) sum+=array1[array1Length--];
            if(array2Length>=0) sum+=array2[array2Length--];
            sumOfArray[k--] = sum%10;
            carry = sum/10;

        }
        sumOfArray[k] = carry;
        for(int i = 0 ; i < sumOfArray.length ; i++)
        {
            System.out.print(sumOfArray[i]+" ");
        }
    }
}
