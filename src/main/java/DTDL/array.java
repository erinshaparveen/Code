package DTDL;

public class array {
    public static void main(StringQuestion[] args) {
        int[] array = {3,23,5,7,9,2,4,7,7,9,2,1};
        int sum = 0 ;
        int index = 0;
        int[] sumOfElement = new int[array.length];
        for(int i = 0 ;i < array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println(sum);
        for(int i = 0 ; i<array.length;i++)
        {
            if(index == i)
            {
                sumOfElement[index] = sum-array[i];
            }
            index++;
        }
        for(int  i= 0; i<array.length;i++)
        {
            System.out.print(sumOfElement[i]+ " ");
        }

        System.out.println();
        reverseArray(array);
        secondLargest(array);
    }

    public static void secondLargest(int[] array)
    {
        int maxElemnt = array[0];
        int secondMaxElement = Integer.MIN_VALUE;
        for(int i = 1; i< array.length ; i++)
        {
            if(array[i]>maxElemnt)
            {
                secondMaxElement =maxElemnt;
                maxElemnt =array[i];
            }
            if(array[i]<maxElemnt && array[i]>secondMaxElement)
            {
                secondMaxElement = array[i];
            }
        }
        System.out.println(secondMaxElement);
    }
    public static void reverseArray (int [] array)
    {
        int low = 0;
        int hight = array.length-1;
        while(low<=hight)
        {
            int temp = array[low];
            array[low] = array[hight];
            array[hight] = temp;
            low++;
            hight--;
        }
        for(int i = 0 ; i<array.length ;i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
