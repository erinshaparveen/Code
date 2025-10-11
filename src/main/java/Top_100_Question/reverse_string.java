package Top_100_Question;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
//        Scanner scr = new Scanner(System.in);
//        String str = scr.nextLine();
//        String[] splitStr = str.split(" ");
//        for(int i =splitStr.length-1 ; i >=0 ; i--)
//        {
//            System.out.print(splitStr[i]+" ");
//        }

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 2;
        boolean flag = true;
        while(counter<=number/2)
        {
            if(number%counter == 0)
            {
                flag = false;
                break;
            }
            counter++;
        }
        if(flag)
        {
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
    }
}
