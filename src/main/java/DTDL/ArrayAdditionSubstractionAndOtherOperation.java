package DTDL;

public class ArrayAdditionSubstractionAndOtherOperation {
    public static void main(StringQuestion[] args) {
        int[] arr1 = {9,1,4,3,7,3,4,7,9,6,4};
        int[] arr2 =   {7,4,5,7,3,4,7,9,6,4};
        int large = arr1.length-1;
        int small = arr2.length-1;
        int[] sum = new int[large+1];
        int sumLength = sum.length-1;
        int borrow = 0 ;
        while(large>=0 || small>=0)
        {
            int sumValue = 0;
            if(large>=0)
            {
                sumValue=arr1[large]+borrow;
            }
            if(small>=0)
            {
                sumValue+=arr2[small];
            }
            sum[sumLength]=sumValue%10;
            borrow=sumValue/10;
            sumLength--;
            large--;
            small--;
        }
        sum[0] = borrow;
        for(int i = 0 ; i<sum.length ;i++)
        {
            System.out.print(sum[i]+" ");
        }
        System.out.println();
        operation(sum);
        substraction(arr1,arr2);
        building(arr1);
        compareArray(arr2, arr1);
        consecutiveSum(arr1);
        divisibleSumPair(arr1);
        int[] arrayTripler = {2 ,6 ,10 ,18 ,16 ,54 ,32 ,64};
        geometricTripler(arrayTripler);
        greaterThan35();
        largetsElementIndex();
        largetsTwiceOfOther();
    }
    public static void operation(int[] array)
    {
        int max= array[0];
        int sum = 0;
        for(int i = 0 ; i <array.length ; i++)
        {
            sum = sum+array[i];
            if(max<array[i])
            {
                max = array[i];
            }
        }
        System.out.println("max  "+ max);
        System.out.println("sum  "+ sum);
        System.out.println("average  "+ sum/array.length);
    }
    public static void substraction(int[] array1, int[] array2)
    {
        int carry = 0;
        int first = array1.length-1;
        int second = array2.length-1;
        int[] result = new int[array1.length];
        int storeValue = result.length-1;
        while(first>=0)
        {
            int top = array1[first]-carry;
            int bottom = (second>=0)? array2[second]:0;
            if(top<bottom)
            {
                top+=10;
                carry =1;
            }
            else
                carry = 0;
            result[storeValue] = top-bottom;
            storeValue--;
            first--;
            second--;
        }
        for(int i = 0 ; i < result.length ;i++)
        {
            System.out.print(result[i]+" ");
        }
    }

    public static void building(int[] arr)
    {
        int maxValue = arr[0];
        for(int i = 1;i <arr.length ;i++)
        {
            if(maxValue<arr[i])
                maxValue=arr[i];
        }
        for(int i = maxValue ; i>0 ;i--) {
            for (int j = 0; j < arr.length; j++)
            {
                if(arr[j]>= i)
                {
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void compareArray(int[] arr1, int[] arr2)
    {
        int sum1 = 0;
        int sum2 =0 ;
        for(int i = 0 ; i <arr1.length ; i++)
        {
            sum1+=arr1[i];
        }
        for(int  i = 0 ; i <arr2.length ;i++)
        {
            sum2+=arr2[i];
        }
        if(sum1>sum2)
        {
            System.out.println("first is larger");
        }
        else
            System.out.println("Second is larger");
    }
    public static void consecutiveSum(int[] arr)
    {
        int value =10;
        int count = 0;
        for(int i = 0 ; i <arr.length-1;i++)
        {
            if(arr[i]+arr[i+1]==value)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void divisibleSumPair(int[] array)
    {
        int count = 0;
        int taget = 4;
        for(int i = 0 ; i<array.length ; i++)
        {
            for(int j = i+1 ; j <array.length ;j++)
            {
                if((array[i]+array[j])%taget == 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void geometricTripler(int[] array)
    {
        for(int i = 0 ; i < array.length ;i++)
        {
            int first = array[i];
            int second = first*3;
            int third = second*3;
            boolean firstFound =false;
            boolean secondFound = false;
            for(int j = i+1; j<array.length;j++)
            {
                if(array[j]==second)
                {
                    second = array[j];
                    firstFound=true;
                    break;
                }
            }
            if(firstFound)
            {
                for(int j = i+1; j<array.length;j++)
                {
                    if(array[j]==third)
                    {
                        secondFound=true;
                        break;
                    }
                }
            }
            if(firstFound && secondFound)
            {
                System.out.println(first+" "+ second+ " "+ third+" ");
            }

        }
    }
    public static void greaterThan35()
    {
        int[] array = {5435,6,5756,23,3435,54656,678,323,54,654};
        for(int i = 0 ; i <array .length ;i++)
        {
            if(array[i]>35)
            {
                System.out.print(array[i]+" ");
            }
        }
    }

    public static void largetsElementIndex()
    {
        int[] array = {5435,6,5756,23,3435,54656,678,323,54,654};
        int largest = array[0];
        int index = 0;
        for(int i = 0 ; i <array .length ;i++)
        {
            if(array[i]>largest)
            {
                largest = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void largetsTwiceOfOther()
    {
        int[] array = {435,6,435,23,43,54656,44,34,54,5};
        int largest = 54656;
        int index = 5;
        boolean flag = false;
        for(int i = 0 ; i <array .length ;i++)
        {
            if(i!=index && largest< array[i]*2)
            {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(index);
    }
}
