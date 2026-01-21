package Coforge;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        System.out.println(dayInMonth(month));
//        int marks = sc.nextInt();
//        System.out.println(gradingAccordingMarks(marks));
//        int year =  sc.nextInt();
//        System.out.println(leapYear(year));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(oddOrSimple(a, b));
    }

    public static String oddOrSimple(int a, int b)
    {
        if(a%2 == 0 || b%2==0)
            return "We are Simple";
        return "We are odd";
    }
    public static boolean leapYear(int year)
    {
        if(year %4==0 && year%100 ==0 || year%400 ==0)
            return true;
        return false;
    }

    public static String gradingAccordingMarks(int marks)
    {
        if(marks>90)
            return "Excellence";
        else if(marks >80 && marks<90)
            return "Very Good";
        else if(marks>70 && marks<80)
            return "Good";
        else
            return "To Improve";
    }

    public static int dayInMonth(int month)
    {
        switch(month)
        {
            case 6: case 11: case 4: case 12:
                return 30;
            case 2:
                return 28;
            case 1: case 3: case 5: case 7: case 8: case 9: case 10:
                return 31;
        }
        return 0;
    }
}
