package May2026;

public class palindromNumber {
    public static void main(String[] args) {
        int num = 7655967;
        int temp = num;
        int rev = 0;
        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(rev==num)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not");
        }
    }
}
