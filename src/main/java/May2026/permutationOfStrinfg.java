package May2026;

public class permutationOfStrinfg {
    public static void main(String[] args) {
        String str = "abc";
        permutaion(str, "");
    }
    public static void permutaion (String str, String ans)
    {
        if(str.length()==0)
            System.out.println(ans);
        else
            for(int i = 0 ; i <str.length() ;i++)
            {
                char ch  = str.charAt(i);
                String rem = str.substring(0, i)+str.substring(i+1);
                permutaion(rem ,  ch+ans);
            }
    }
}
