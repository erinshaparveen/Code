package DTDL;

public class palindromString {
    public static void main(String[] args) {
        String str = "aavbbccbbaa";
        String strSpace= "hay Insha this Is Your turn";
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i <strSpace.length(); i++)
        {
            if(strSpace.charAt(i)!= ' ')
                result.append(strSpace.charAt(i));
        }
        System.out.println(result.toString());
        int low = 0;
        int high = str.length()-1;
        while(low<high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                System.out.println("false");
                return;
            }
            low++;
            high--;
        }
        System.out.println("true");


    }
}
