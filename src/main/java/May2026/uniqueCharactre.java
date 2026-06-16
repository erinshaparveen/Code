package May2026;

public class uniqueCharactre {
    public static void main(String[] args) {
        String str = "fgfdgdfgee32547yhgfw42qwsfgfdgdfgee32547yhgfw42qws@@fgfdgdfgee32547yhgfw42qws";
        boolean[] unique = new boolean[128];
        for(int i = 0 ;  i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(!unique[ch])
            {
                unique[ch] = true;
                System.out.print(ch+" ");
            }
        }

    }
}
