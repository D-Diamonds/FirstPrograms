/*
* class NumberInfoLandsman
*
* Finds Even/Odd, if prime, and GCF of every number
* up to and including the preset max number.
*
* Author: Josh Landsman
*/


public class NumberInfoLandsman {
    public static void main(String[] args) {

        int max = 27;

        // Iterates through every number up to and including max
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
            // Print if number is odd/eve
            if (i % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");

            boolean isPrime = true;
            int gcf = 0;
            // Determines if number is prime or not
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    // Determines GCF if not prime
                    for (int k = 1; k < i; k++) {
                        if (i % k == 0)
                            gcf = k;
                    }
                    break;
                }
            }
            // Prints results
            if (i == 1) {
                System.out.println("Not prime\n");
                continue;
        }
            if (isPrime)
                System.out.println("Prime \n");
            else if (!isPrime) {
                System.out.println("Not prime");
                System.out.println("GCF: " + gcf + "\n");
            }

        } // main for loop
    } // main()
} // class NumberInfoLandsman
