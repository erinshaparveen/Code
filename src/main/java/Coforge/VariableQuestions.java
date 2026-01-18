package Coforge;

import java.util.Scanner;

public class VariableQuestions {
    public static void main(String[] args) {

        // Agent Vinod
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is Agent "+name);

        //Celcius to farenhite
        double celcius = sc.nextFloat();
        double ferenhite = (celcius*1.8)+32;
        System.out.printf("%.6f", ferenhite);

        // Parameter and Area of the Circle
        double radius = sc.nextFloat();
        System.out.println(2*3*radius);
        System.out.println(3*radius*radius);

        // Cube a+b3 = a3+b3+2a2b+2ab2
        int a = sc.nextInt();
        int b = sc.nextInt();
        int abCube = (a+b)*(a+b)*(a+b);
        int aCube = a*a*a;
        int bCube = b*b*b;
        int abSquare = 3*a*b*b;
        int aSquareb = 3*a*a*b;
        System.out.println(abCube+ " " + (aCube+bCube+abSquare+aSquareb));
        if(abCube == (aCube+bCube+abSquare+aSquareb))
        {
            System.out.println("Verified");
        }
        else
        {
            System.out.println("Not Verified");
        }

    }
}
