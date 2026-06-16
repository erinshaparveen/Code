package Twenty_LPA;

import java.util.Stack;

public class stackIntegration {
    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();

        stck.push(4);
        stck.push(8);
        stck.push(10);
        stck.push(78);
        stck.push(67);
        stck.push(78);
        System.out.println(stck.peek());
        stck.pop();
        System.out.println(stck.isEmpty());
        System.out.println(stck);
    }
}
