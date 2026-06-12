package May2026;

public class numberReverse {
    public static void main(String[] args) {
        int num = 66743;
        int rev = 0;
        while(num>0)
        {
            rev = rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
