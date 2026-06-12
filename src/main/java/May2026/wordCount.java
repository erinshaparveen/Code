package May2026;

public class wordCount {
    public static void main(String[] args) {
        String str = "hjdsf sdfjdsg dfsgidfkng dfxcfikdn gvdrfdrgkmvd fxc";
        int count=1;
        for(int i = 0 ; i<str.length() ;i++)
        {
            if(i+1<str.length())
            {
                if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
                    count++;
            }
        }
        System.out.println(count);
    }
}
