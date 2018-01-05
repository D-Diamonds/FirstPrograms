/*
* class LiftoffLandsman
*
* Outputs a countdown
*
* Author: Josh Landsman
*/

public class LiftoffLandsman {
    public static void main(String[] args) {

        // Defaults
        int count = 10;
        System.out.println("Preparing launch...");

        // Launch sequence
        //while (count >= 0) {
        //    System.out.println(count);
        //    count--;
        //}

        for (int i = 0; i <= count; i++)
            System.out.println(count - i);

        System.out.println("Liftoff");
    } // main()
} // class LiftoffLandsman
