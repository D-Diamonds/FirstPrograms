/*
* StringFormatting class
*
* Description
*
* Author: Josh Landsman
*/

public class StringFormatting {

    public static void main(String[] args) {

        // Prints out variable balance
        double balance = 1234.567;
        int num1 = 367;
        System.out.printf("Your remaining balance is $%,6.2f", balance);
        System.out.println("\n");

        System.out.printf("%,.2f\n", balance);
        System.out.printf("%5d\n", num1);


    } // main()

} // StringFormatting Class
