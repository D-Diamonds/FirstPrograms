import java.util.Scanner;

public class InHighSchool {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("What is your grade level? ");
        int gradeLevel = s.nextInt();

        if (gradeLevel >= 9 && gradeLevel <= 12)
            System.out.print("You are in high school.");
        else if (gradeLevel >= 1)
            System.out.print("You are not in high school yet.");
        else
            System.out.print("You are not in high school or an invalid response.");

    }
}
