package DTDL;

public class isPrime {
    public static void main(String[] args) {
        int num =7;
        for(int i = 2 ; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
