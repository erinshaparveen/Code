package DTDL;

public class noOfDigit {
    public static void main(String[] args) {
        int num =-133243;
        int count = 0 ;
        if(num<0)
            num*=-1;
        if(num == 0)
            num=1;
        while(num>0)
        {
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
