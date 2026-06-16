package May2026;

public class shortedDisatnce {
    public static void main(String[] args) {
        int[] array = {2,7,6,9,12,45,67,89,4243,45,657,68};
        int shortest = -1;
        int minVaulue = Integer.MAX_VALUE;
        for(int i = 0;i<array.length ;i++)
        {
            if(array[i]%2==0)
            {
                if(shortest!=-1)
                {
                    int distance  =i-shortest;
                    minVaulue = Math.min(distance, minVaulue);
                }
                else
                    shortest=i;
            }
        }
            System.out.println(minVaulue);

    }
}
