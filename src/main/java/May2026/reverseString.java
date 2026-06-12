package May2026;

public class reverseString {
    public static void main(String[] args) {
        String str ="dhjfgds";
        char[] arr = str.toCharArray();
        int left = 0 ;
        int right = str.length()-1;
        while(left<right)
        {
            char ch = str.charAt(left);
            arr[left] = arr[right];
            arr[right]=ch;
            left++;
            right--;
        }
        str = new String(arr);
        System.out.println(str);

        StringBuilder result = new StringBuilder(str);
        result.reverse().toString();
        System.out.println(result);
    }
}
