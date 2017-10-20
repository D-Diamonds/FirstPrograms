/*
 * CastingCorrections class
 *
 * Each problem takes the original variables and casts
  * them to doubles as needed
 * to create expected outputs.
 * 
 * Author: Josh Landsman
 */

class CastingCorrectionsLandsman
{

    public static void main(String[] args) {

        // Variables
        int cakeDiameter = 11;
        double PI = 3.14;
        int cakeHeight = 5;
        int cakeCalories = 2500;
        int slices = 8;

        // Problem 1 - cake radius = 5.5
        double cakeRadius = (double)cakeDiameter/2;
        System.out.println(cakeRadius);

        // Problem 2 - plate size = 94.985
        double plateSize = PI * ((double)cakeDiameter * cakeDiameter / 4);
        System.out.println(plateSize);

        // Problem 3 - slice calories = 312.5
        double sliceCalories = (double)cakeCalories/slices;
        System.out.println(sliceCalories);

        // Problem 4 - icing area =~ 181.335
        double icingArea = plateSize + ((double)cakeDiameter/2 * PI * cakeHeight);
        System.out.println(icingArea);

    } // main() method
} // CastingCorrectionsLandsman class