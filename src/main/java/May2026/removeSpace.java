package May2026;

public class removeSpace {
    public static void main(String[] args) {
        String str = "rrf r ferg er trer tfer";
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i< str.length() ;i++)
        {
            if(str.charAt(i)!=' ')
            {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
