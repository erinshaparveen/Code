package May2026;

public class largestElementIndec {
    public static void main(String[] args) {
        int[] num = {43,1,3,545,788,23,34326,56878,978,23};
        int largest = num[0];
        int index = 0;
        for(int i = 0 ; i <num.length ;i++)
        {
            if(num[i]>largest)
            {
                largest = num[i];
                index = i;
            }

        }
        System.out.println(index);
    }
}
