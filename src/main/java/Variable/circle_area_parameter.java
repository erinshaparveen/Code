package Variable;
//Circle Area-Perimeter
//You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.
//
//Note: Take pi as 3
//
//Input Format
//One line contains an integer number which is the radius of a circle.
//
//        Output Format
//Print the area of the circle in the first line
//
//Print the perimeter of the circle in the second line
//
//Example 1
//Input
//
//4
//Output
//
//48
//        24
//Explanation
//
//pi * r * r = 48 and 2 * pi * r = 24, where r is the radius.
//
//        Example 2
//Input
//
//7
//Output
//
//147
//42

import java.util.Scanner;

public class circle_area_parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(2*3*r); //parameter
        System.out.println(3*r*r); //area
    }
}
