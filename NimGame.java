import java.util.Scanner;

public class NimGame {

    static int nSticks = 21;
    static int player = 1;
    static final int MAX_STICKS = 3;
    static final int MIN_STICKS = 1;

    private static boolean checkSticks(int sticksDrawn) {
        if (nSticks < sticksDrawn)
            return false;
        else if (sticksDrawn <= MAX_STICKS && sticksDrawn >= MIN_STICKS)
            return true;
        return false;
    }

    private static void takeSticks(int sticksDrawn) {
            nSticks -= sticksDrawn;
            System.out.println("Now taking " + sticksDrawn + " sticks.");
    }

    private static void changePlayer() {
        player = 3 - player;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the game of Nim! \nThe game starts with " + nSticks + " sticks. \nYou may take " + MIN_STICKS + " to " + MAX_STICKS + " sticks at a time.\n");

        while (nSticks > 0) {
            System.out.print("Player " + player + ": ");
            int sticksDrawn = s.nextInt();

            if (checkSticks(sticksDrawn)) {
                takeSticks(sticksDrawn);
                if (nSticks > 0) {
                    changePlayer();
                    if (nSticks == 1) {
                        System.out.println("It is now player " + player + "'s turn. There is " + nSticks + " stick remaining.\n");
                    } else
                        System.out.println("It is now player " + player + "'s turn. There are " + nSticks + " sticks remaining.\n");
                    if (nSticks < 3)
                        System.out.println("You may only take " + nSticks + " to " + (MIN_STICKS) + " sticks");
                }
            }
            else {
                System.out.println("Invalid turn. Player " + player + " go again.");
            }
        }

        System.out.println("\nThere are no sticks left!\nPlayer " + (3 - player) + " wins!");
    }
}
