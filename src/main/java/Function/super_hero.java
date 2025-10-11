package Function;

import java.util.Scanner;

//Max Score: 30
//Super Hero
//You have given a string name of user. The user gives his name as to you and your task is to return string "name" is a Super Hero.
//
//You have to complete ModifyName function which consists of single string name as input and return the string as mentioned above as output
//
//Input Format
//The first line of input contains a string.
//
//Output Format
//Print "name" is a Super Hero
//
//Example 1
// Input
//
//        Accio
// Output
//
//Accio is a Super Hero
public class super_hero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        string_addition(str);
    }
    public static void string_addition(String str)
    {
        System.out.println(str +" is a Super Hero");
    }
}
