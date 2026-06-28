package DTDL;

public class lowerUpperCase {
    public static void main(String[] args) {
        String str = "sdhHUIHWDhjksdGIUWD";
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        for(int i = 0 ; i < str.length() ;i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
                lower.append(str.charAt(i));
            else
                upper.append(str.charAt(i));
        }
        System.out.print(lower+ " "+ upper);
    }
}
