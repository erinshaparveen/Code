package DTDL;

public class arrayRotation {
    public static void main(String[] args) {
        int[] num ={12,43,12,344,2,3,54,2,43,32,65,12};
        int rotate =3;
        int count = 0;
        while(count<rotate)
        {
            int last = num[num.length-1];
            for(int i = num.length-1 ;i>0;i--)
            {
                num[i]= num[i-1];
            }
            num[0] = last;
            count++;
        }

        for(int i = 0 ;i<num.length;i++)
        {
            System.out.print(num[i]+ " ");
        }
    }
}
