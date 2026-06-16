package Twenty_LPA;

public class subtractionOfTwoArray {
    public static void main(String[] args) {
        int[] array1 =  {3,5,7,7,2,1,2,6,8,9};
        int[] array2 =   {5,4,2,1,6,9,0,3,1};
        int i = array1.length;
        int j = array2.length;
        int[] result = new int[i];
        int borrow = 0;
        int ar1 = i-1 ;
        int ar2 = j-1 ;
        int k = result.length-1;
        while(ar1>=0)
        {
            int top = array1[ar1]-borrow;
            int bottom = (ar2>=0)? array2[ar2]:0;
            if(top<bottom)
            {
                top =top+10;
                borrow = 1;
            }
            else
            {
                borrow = 0;
            }
            result[k] = top-bottom;
            k--;
            ar1--;
            ar2--;

        }
        for(int l = 0 ; l < array1.length ;l++)
        {
            System.out.print(result[l]+" ");
        }
    }
}
