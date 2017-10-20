/*
* FormattingOutputLandsman class
*
* This program nicely formats
* the printing of a week's finances.
* In addition, the program
* adds up all income/expenses
* and returns an ending balance
*
* Author: Josh Landsman
*/

public class FormattingOutputLandsman {
    public static void main(String[] args) {

        //Variables
        double balance = 500;
        double coffee = -3.2;
        double rent = -600;
        double groceries = -54.35;
        double paycheck = 1322.77;
        int roadTrip = -544;

        //Prints out all the incomes and expenses and starting balance
        System.out.printf("$%9.2f\n%10.2f\n%10.2f\n%10.2f\n%10.2f\n%+,10.2f\n----------\n", //Coul
                balance, coffee, rent, groceries, ((double)roadTrip / 5), paycheck);
        //Prints out the ending balance after adding all income/expenses to starting balance
        double endingBalance = balance + coffee+ rent + groceries+ ((double)roadTrip / 5)+ paycheck;
        System.out.printf("$%,9.2f", endingBalance);


    } //main()
} //FormattingOutputLandsman Class
