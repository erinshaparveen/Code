package May2026;

public class separateCharaterLetter {
    public static void main(String[] args) {
        String str = "dfgdf45dfe54rtgdtf";
        StringBuilder character = new StringBuilder();
        StringBuilder integer = new StringBuilder();
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                character.append(str.charAt(i));
            }
            else
                integer.append(str.charAt(i));
        }
        System.out.println(character+ " "+ integer);
    }
}
