package May2026;

public class reverseWord {
    public static void main(String[] args) {
        String str = "Hay! my name is Insha";
        String[] strArray = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i<strArray.length ;i++)
        {
            String revString  = "";
            String result = strArray[i];
            for(int j = 0 ; j <result.length();j++)
            {
                char ch = result.charAt(j);
                revString = ch+revString;
            }
            stringBuilder.append(revString+ " ");
        }
        System.out.println(stringBuilder.toString());
    }
}
