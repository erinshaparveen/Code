package DTDL;

public class uniqueChaarcter {
    public static void main(String[] args) {
        String str = "aaaa####%%%%%VVVVV";
        boolean[] unique = new boolean[128];
        for(int i = 0 ; i < str.length() ;i++)
        {
            char ch= str.charAt(i);
            if(!unique[ch])
            {
                System.out.print(ch);
                unique[ch] = true;
            }
        }
    }
}
