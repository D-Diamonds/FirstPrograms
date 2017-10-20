/*
* VariableOperations class
*
* Description
*
* Author: Josh Landsman
*/

public class VariableOperations {
    public static void main(String[] args) {


        int num1 = 2;
        int num2 = 4;
        double double1 = 2.345;
        double double2 = 10.2;

        // print out any one of the variables
        System.out.println(num1);

        // prints out manipulated variables
        System.out.println(num1 - num2 + "\n");
        System.out.println(double1 + double2 + "\n");

        // print operation results involving two variable types
        System.out.println(num2 * double1);
        System.out.println(double2 / num1);

        int num3 = num1 - num2;
        double double3 = double2 + double1;
        System.out.println(num3);
        System.out.println(double3);

        //prints out remainder only works on integers not decimal numbers
        int num4 = 3;
        System.out.println(4%3);
        System.out.println(num4 %2);

        //unexpected situations
        double double4 = num1 - num2;
        System.out.println(double4);

        //double num5 = double2 - double1;  doesn't work for memory purposes

        //unary operators
        int j = 5;
        j++; //increment operator (j = j + 1)
        System.out.println(j);
        j--; //decrement operator
        System.out.println(j);

        System.out.println(2/5);

    } // main() method
} // class VariableOperations
