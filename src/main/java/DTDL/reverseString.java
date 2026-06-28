package DTDL;

public class reverseString {
    public static void main(String[] args) {
        String str = "HeeloInsha";
        String rev ="";
//        for(int i = 0 ; i < str.length() ;i++)
//        {
//            char ch = str.charAt(i);
//            rev =  ch+rev;
//        }

        StringBuilder result = new StringBuilder(str);
        System.out.println(rev);
        System.out.println(result.reverse().toString());
    }
}
