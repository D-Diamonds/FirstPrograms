/*
* class QuadraticFormulaLandsman
*
* Solves the quadratic equation
* after user input for coefficients
*
* Author: Josh Landsman
*/

// Imports
import java.lang.Math;
import java.util.Scanner;

public class QuadraticFormulaLandsman {
    public static void main(String[] args) {

        // Variables
        Scanner s= new Scanner(System.in);
        double a;
        double b;
        double c;
        double answer1;
        double answer2;
        double answer3;

        // Prompt the user
        System.out.println("Equation should be structured as ax^2+bx+c = 0.");
        System.out.print("Please enter a: ");
        a = s.nextDouble();
        System.out.print("Please enter b: ");
        b = s.nextDouble();
        System.out.print("Please enter c: ");
        c = s.nextDouble();

        // Find the roots
        answer1 = (0-b + Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
        answer2 = (0-b - Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);

        // Check if NaN, 1 root, or two roots and print results
        if (Double.isNaN(answer1) && Double.isNaN(answer2))
            System.out.println("No real roots");
        else if (Math.sqrt(Math.pow(b, 2)-4*a*c) == 0) {
            answer3 = (0 - b) / (2 * a);
            System.out.println("The root of the equation is at x = " + answer3);
        }
        else
            System.out.println("The roots of the equation are at x = " + answer1 + " and " + answer2);

    } // main()
} // class QuadraticFormulaLandsman
