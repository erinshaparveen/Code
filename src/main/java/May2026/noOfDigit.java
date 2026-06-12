package May2026;

public class noOfDigit {
    public static void main(String[] args) {
        int number =2354534;
        if(number<0)
            number*=-1;
        if(number==0)
            number = 1;
        int count = 0 ;
        while(number>0)
        {
            number/=10;
            count++;
        }
        System.out.println(count);
    }
}
