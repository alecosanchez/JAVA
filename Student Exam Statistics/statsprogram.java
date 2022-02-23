import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class statsprogram {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        //importing the inputfile
        File myFile = new File("/Users/alecosanchez/Desktop/PROGRAMMING/INTRO TO JAVA/studentinfo.txt");

        PrintWriter outputFile = new PrintWriter("theoutput.txt");

        //initializing the Scanner
        Scanner scan = new Scanner(myFile);

        //output file
        //PrintWriter myoutputfile = new PrintWriter("myOutputfilet.txt");

        //Declaration of Variables
        int id;
        double right, wrong, omitted, answered;
        double grade, CAP;
        int numstu = 0;

        id = scan.nextInt();


        outputFile.println("ID: " + id);
        while(id != -1){

            right = scan.nextDouble();

            wrong = scan.nextDouble();

            outputFile.println(right + " Right\t" + wrong + " Wrong");

            answered = right + wrong;
            outputFile.println("Total Answered: " + answered);

            omitted = (right + wrong - 50) * -1;
            outputFile.println(omitted + " Omitted");

            grade = right * 2;
            outputFile.println("Grade: " + grade);

            CAP = right / answered;
            outputFile.printf("Correct answer percentage: %.2f\n", CAP);

            if (CAP < .5) {
                outputFile.println("More Wrong than right");
            }
            if (CAP > .5) {
                outputFile.println("More Right than wrong");
            }
            if (omitted > 10) {
                outputFile.println("More than 10 omitted");
            }
            if (omitted < 10) {
                outputFile.println("less than 10 omitted");
            }

            id = scan.nextInt();

            outputFile.println();
            outputFile.println("ID: " + id);
            numstu++;

        }
        outputFile.println();
        outputFile.println("Sentinel marked, all students accounted for!");
        outputFile.println("Total number of students: " + numstu);
        System.out.println();
        System.out.println("The Program has Completed!");
        outputFile.close();
    }
}




