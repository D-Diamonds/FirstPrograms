/*
 * class ReturnMethodsLandsman
 *
 * Program is created to show the usage of methods
 * Description of each method is present above the start of the block
 *
 * Author: Josh Landsman
 */

public class ReturnMethodsLandsman {

    // returns true if even, else false
    static boolean isEven(int x) {
        return (x % 2 == 0) ? true : false;
    } // isEven()

    // returns true if string starts with a vowel, else false
    static boolean startsWithVowel(String str) {
        char letter = str.charAt(0);
        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') ? true : false;
    } // startsWithVowel()

    // returns slope intercept form of y= mx + b with given doubles
    static String slopeIntercept(double slope, double yIntercept) {
        return ("y = " + slope + "x + " + yIntercept);
    } // slopIntercept()

    // returns true if date input is Christmas, else false
    static boolean isChristmas(int month, int day) {
        return (month == 12 && day == 25) ? true : false;
    } // isChristmas()

    // returns a string of length n of the original, if string length is less than n returns string
    static String chopOff(int n, String str) {
        if (str.length() < n)
            return str;
        return str.substring(0, n);
    } // chopOff()

    // returns a random int between x and y
    static int randomInt(int x, int y) {
        if (x > y) {
            return (int) (Math.random() * (x - y + 1)) + y;
        }
        else {
            return (int) (Math.random() * (y - x + 1)) + x;
        }
    } // randomInt()

    // returns whether or not an int is a perfect square
    static  boolean perfectSquare(int x) {
        double sqrt = Math.sqrt(x);
        int y = (int) sqrt;
        return (y*y == x) ? true : false;
    } // perfectSquare()

    public static void main(String[] args) {
        System.out.println(isEven(3));
        System.out.println(startsWithVowel("bc"));
        System.out.println(slopeIntercept(4.2, -5.3));
        System.out.println(isChristmas(11, 25));
        System.out.println(chopOff(3, "He"));
        System.out.println(randomInt(5, 2));
        System.out.println(perfectSquare(25));

    } // main()
} // class ReturnMethodsLandsman
