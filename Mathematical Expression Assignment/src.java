package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter outputFile = new PrintWriter("myOutputFile.txt");
        //Declaration of Variables
        double x, y;
        double input, output;
        x = -3;
        output = 0;
        y = 0;

        //Basic Header specifying the columns below.
        outputFile.print("\n");
        outputFile.println("X Values: \t\tY Values: \t\t\tPolarity: ");

        //Writing the expression for the given formula.
        for (x = -3; x <= 4; x += .5) {
            y = (9 * x * x * x - 27 * x * x - 4 * x + 12) / ((Math.sqrt(3 * x * x + 1)) + (Math.abs(5 - x * x * x * x)));

            //Skipping a line for spacing
            outputFile.println();

            //Printing the X and Y values as each is computed.
            outputFile.printf("X =  " + x + "\t\tY = %8.3f" ,y);

            //Determining the polarity of the output and printing its respective string.
            if (y == 0) {
                outputFile.print("\t\tY IS ZERO ");
            }
            if (y < 0) {
                outputFile.print("\t\tY IS NEGATIVE ");
            }
            if (y > 0) {
                outputFile.print("\t\tY IS POSITIVE ");
            }

        }
        //Stating the completion of the program.
        outputFile.println("\n");
        outputFile.print("\t\t\t" + "The Table is Finished!");
        System.out.print("The Program has Completed!");
        outputFile.close();
    }

}








