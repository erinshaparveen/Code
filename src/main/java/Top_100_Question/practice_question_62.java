package Top_100_Question;

import java.util.Scanner;

public class practice_question_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int twice_largest_side_square = 2*(z*z);
        int sum_of_square = x*x+y*y+z*z;
        if(twice_largest_side_square < sum_of_square) System.out.println("acute-angled");
        else if(twice_largest_side_square > sum_of_square) System.out.println("obtuse-angled");
        else System.out.println("right-angled");
    }
}
