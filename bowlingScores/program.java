import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class program {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        //Creating an input file
        File myfile = new File("/Users/alecosanchez/Desktop/PROGRAMMING/INTRO TO JAVA/Bowling Scores/bowling/src/scores.txt");

        //creating the output file
        PrintWriter outputFile = new PrintWriter("prgmOutput.txt");

        //initializing the Scanner

        Scanner scan = new Scanner(myfile);

        //Defining variables for inputted scores
        int score1, score2, score3;
        int numscores, groupTotal, validGroups, invalidGroups;
        groupTotal = 0;
        validGroups = 0;
        invalidGroups = 0;


        //looping in all of the data and computing it

        while (scan.hasNext()) {

            groupTotal++;

            score1 = scan.nextInt();
            outputFile.println("score 1: " + score1);
            score2 = scan.nextInt();
            outputFile.println("score 2: " + score2);
            score3 = scan.nextInt();
            outputFile.println("score 3: " + score3);

            //reading in and assigning the brackets for the computed data.

            if (validGroup(score1, score2, score3, outputFile)) {
                validGroups += 1;
                OneGameScore(score1, outputFile);
                OneGameScore(score2, outputFile);
                OneGameScore(score3, outputFile);
            } else {
                outputFile.println();
                continue;// continue if invalid group
            }

            int average = averageScores(score1, score2, score3);

            outputFile.println("Your average score is: " + average);
            OneGameScore(average, outputFile);
            outputFile.println("\n\n\n");
            invalidGroups = groupTotal - validGroups;
        }
        outputFile.println("There are " + groupTotal + " groups");

        outputFile.println("There are " + validGroups + " valid groups");

        outputFile.println("There are " + invalidGroups + " invalid groups");

        System.out.println("The program has completed!");

        outputFile.close();
    }

    //Method check for validation of groups
    static boolean validGroup (int score1,int score2, int score3, PrintWriter outputFile)
    {
        if(score1<0){
            outputFile.println("Score 1 is less than 0");
            return false;
        }
        if(score2<0){
            outputFile.println("Score 2 is less than 0");
            return false;
        }
        if(score3<0){
            outputFile.println("Score 3 is negative, invalid");
            return false;
        }
        if(score1>300){
            outputFile.println("Score 1 is greater than 300");
            return false;
        }
        if(score2>300){
            outputFile.println("Score 2 is greater than 300");
            return false;
        }
        if(score3>300){
            outputFile.println("Score 3 is greater than 300, invalid");
            return false;
        }
        return true;
    }

    //determining and printing the brackets corresponding to the given scores
    static void OneGameScore(int score, PrintWriter outputFile)
    {
        if(score >= 250 && score <= 300)
            outputFile.println(score +": professional game");

        if(score >= 200 && score <= 249)
            outputFile.println(score +": excellent game");

        if(score >= 140 && score <= 199)
            outputFile.println(score +": very good game");

        if(score >= 100 && score <= 139)
            outputFile.println(score +": good game");

        if(score >=50 && score<=99)
            outputFile.println (score +": poor game");

        if(score < 50)
            outputFile.println(score +": Horrible game");
    }
    //calculating the average of the three scores and returning the value back to main
    static int averageScores (int score1,int score2, int score3)
    {
        return (score1 + score2 + score3) / 3;
    }

}
