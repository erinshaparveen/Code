package DTDL;
import java.util.*;

public class printPattern {
    public static void main(StringQuestion[] args) {
        int high =100;
        int low = 10;
        while(low<=high)
        {
            System.out.print(high+ " ");
            if(low!=high)
                System.out.print(low+ " ");
            low+=10;
            high-=10;
        }
        Stack<Integer> stck = new Stack<>();
        stck.push(54);
        stck.push(67);
        stck.push(32);
        stck.push(45);
        stck.push(13);
        stck.push(67);
        System.out.println(stck);
        System.out.println(stck.peek());
        System.out.println(stck.pop());
    }
}
