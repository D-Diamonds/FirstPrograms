/*
* GradeAverager class
*
* This class creates three int variables to represent class grades, prints them out nicely
* aligned, and then takes their average.
*
* Author: Josh Landsman
*/
class Gradeaverager {
    public static void main(String[] args) {

        // create three int variables for the three grades
        int grade1 = 75;
        int grade2 = 84;
        int grade3 = 100;

        // calculate the average of the three grades
        double average = (double)(grade1 + grade2 + grade3) / 3;

        // print out the three grades, out of 100, with the tens and ones places aligned
        System.out.println("The three grades are:");
        System.out.printf("%3d/100\n", grade1);
        System.out.printf("%3d/100\n", grade2);
        System.out.printf("%d/100\n\n", grade3);

        // print out the average
        System.out.printf("The average is: %.2f", average);

    } // main()
} // GradeAverager class