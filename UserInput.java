/*
* UserInput class
*
* Description
*
* Author: Josh Landsman
*/

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Int: ");
        int y = s.nextInt();
        System.out.print("String: ");
        String test = s.nextLine();
        System.out.print("Int: ");
        int x = s.nextInt();
        System.out.println(y);
        System.out.println(test);
        System.out.print(x);


    } // main()
} // UserInput class
