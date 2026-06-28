package DTDL;

public class palinrdrom {
    public static void main(String[] args) {
        int num = 123221;
        int temp = num;
        int rev = 0;
        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp = temp/10;
        }
        System.out.println(num==rev);
    }
}
