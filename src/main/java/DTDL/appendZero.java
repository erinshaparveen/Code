package DTDL;

public class appendZero {
    public static void main(String[] args) {
        int[] array = {1,2,3,0,6,0,9,0,4,2,1,1,3,0};
        int count = 0 ;
        int[] result=new int[array.length];
        for(int num:array)
        {
            if(num!=0)
                {
                    result[count++] = num;
                }
        }
        for(int i = count ;i <array.length ;i++)
        {
            result[i] = 0;
        }
        for(int num: result)
        {
            System.out.print(num+ " ");
        }

    }
}
