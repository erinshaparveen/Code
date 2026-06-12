package May2026;

public class palindromString {
    public static void main(String[] args) {
        String str = "asdfgfdsa";
        int left = 0;
        int reight = str.length()-1;
        boolean flag = true;
        while(left<reight)
        {
            if(str.charAt(left)!=str.charAt(reight))
            {
                System.out.println("Not");
                flag=false;
                break;
            }
            left++;
            reight--;
        }
       if(flag)
       {
           System.out.println("Plindrom");
       }
    }
}
