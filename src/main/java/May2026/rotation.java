package May2026;

public class rotation {
    public static void main(String[] args) {
        int[] array = {5,7,8,9,1,2,4};
        int rotate = 3;
        while(rotate>0)
        {
            int valu = array[array.length-1];
            for(int i = array.length-1 ; i > 0; i--)
            {
                array[i] = array[i-1];
            }
            array[0] = valu;
            rotate--;
        }

        for(int i = 0 ; i <array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
