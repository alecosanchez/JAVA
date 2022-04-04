import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CalcProgram {
    private static PrintWriter opfile;

    //Running the menu which contains all of the operations and user interface
    public static void main(String[] args) throws FileNotFoundException{
        Scanner keyboard = new Scanner(System.in);
        String filename;
        System.out.print("Enter File Name: ");
        filename = keyboard.next();
        try {
            opfile = new PrintWriter(new File(filename));
            menu();
            opfile.close();
            System.out.println("Output written to output file " + filename);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }



    }
    //Menu method
    public static void menu() throws FileNotFoundException {
        //Prompting the user using the keyboard
        Scanner keyboard = new Scanner(System.in);
        //Storing their command as a string in variable "option"
        String option = "";
        //Program runs until any case instance of Q is inputted
        while (!option.equalsIgnoreCase("Q")) {
            //Text instructing the options in the calculator
            System.out.println();
            System.out.println("\t\t\t\tWelcome to my calculator!");
            System.out.println();
            System.out.println("Please select the arithmetic operator you would like to use...");
            System.out.println("Valid inputs: +, -, *, /, or % " + "\n'A' to find the average \n'X' for the maximim\n'M' for the minimim\n'S' for the square\n'Q' to quit.");
            System.out.println();
            System.out.print("Your arithmetic operator: ");
            //Automatically switches a user input to uppercase for easier usability and readability from the program
            option = keyboard.next().toUpperCase();
            //Switch Statement
            switch (option){
                case "+":
                    add();
                    break;
                case "-":
                    subtract();
                    break;
                case "*":
                    multiply();
                    break;
                case "/":
                    divide();
                    break;
                case "%":
                    modulo();
                    break;
                case "A":
                    Avg();
                    break;
                case "X":
                    Max();
                    break;
                case "M":
                    Min();
                    break;
                case "S":
                    Square();
                    break;
                case "Q":
                    break;
                    //The default is an invalid input
                default:
                    System.out.println("Invalid input");
            }
        }

    }
    //addition method containing algorithm and prompts
    private static void add () {

        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Addition");
        System.out.print("Enter an auggend: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter an addend: ");
        num2 = keyboard.nextInt();
        sol = num1 + num2;
        System.out.println("Augend: " + num1);
        System.out.println("Addend : " + num2);
        System.out.println("Sum : " + sol);

        //Output File
        opfile.println("Selection: Addition");
        opfile.println("Augend: " + num1);
        opfile.println("Addend : " + num2);
        opfile.println("Sum : " + sol);

    }
    //Subtraction method containing algorithm and prompts
    private static void subtract () {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Subtraction");
        System.out.print("Enter a minuend: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter a subtrahend: ");
        num2 = keyboard.nextInt();
        sol = num1 - num2;

        System.out.println("Minuend: " + num1);
        System.out.println("Subtrahend: " + num2);
        System.out.println("Difference: " + sol);

        opfile.println("Selection: Subtraction");
        opfile.println("Selection: Subtraction");
        opfile.println("Minuend: " + num1);
        opfile.println("Subtrahend: " + num2);
        opfile.println("Difference: " + sol);

    }
    //Division method containing algorithm and prompts
    private static void divide () {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Division");
        System.out.print("Enter a dividend: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter a divisor: ");
        num2 = keyboard.nextInt();
        sol = num1 / num2;

        System.out.println("Dividend: " + num1);
        System.out.println("Divisor: " + num2);
        System.out.println("Quotient: " + sol);

        opfile.println("Selection: Division");
        opfile.println("Dividend: " + num1);
        opfile.println("Divisor: " + num2);
        opfile.println("Quotient: " + sol);

    }
    //Multiplication method containing algorithm and prompts
    private static void multiply () {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Multiplication");
        System.out.print("Enter a multiplicand: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter a multiplier: ");
        num2 = keyboard.nextInt();
        sol = num1 * num2;

        System.out.println("Multiplicand: " + num1);
        System.out.println("Multiplier: " + num2);
        System.out.println("Product: " + sol);

        opfile.print("Enter a multiplicand: ");
        opfile.println("Multiplicand: " + num1);
        opfile.println("Multiplier: " + num2);
        opfile.println("Product: " + sol);

    }
    //Modulo method containing algorithm and prompts
    private static void modulo() {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Modulo");
        System.out.print("Enter your first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter your second number: ");
        num2 = keyboard.nextInt();
        sol = num1 % num2;

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Modulo: " + sol);

        opfile.println("Selection: Modulo");
        opfile.println("First Number: " + num1);
        opfile.println("Second Number: " + num2);
        opfile.println("Modulo: " + sol);

    }
    //Average method containing algorithm and prompts
    private static void Avg () {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Average");
        System.out.print("Enter your first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter your second number: ");
        num2 = keyboard.nextInt();
        sol = (num1 + num2) / 2;

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Average: " + sol);

        opfile.println("Selection: Average");
        opfile.println("First Number: " + num1);
        opfile.println("Second Number: " + num2);
        opfile.println("Average: " + sol);

    }
    //Maximum method containing algorithm and prompts
    private static void Max () {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Maximum");
        System.out.print("Enter your first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter your second number: ");
        num2 = keyboard.nextInt();
        if (num1 > num2)
            sol = num1;
        else
            sol = num2;

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Maximum: " + sol);

        opfile.println("Selection: Maximum");
        opfile.println("First Number: " + num1);
        opfile.println("Second Number: " + num2);
        opfile.println("Maximum: " + sol);


    }
    //Minimum method containing algorithm and prompts
    private static void Min () {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sol;
        System.out.println("Selection: Minimum");
        System.out.print("Enter your first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter your second number: ");
        num2 = keyboard.nextInt();
        if (num1 < num2)
            sol = num1;
        else
            sol = num2;

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Maximum: " + sol);

        opfile.println("Selection: Minimum");
        opfile.println("First Number: " + num1);
        opfile.println("Second Number: " + num2);
        opfile.println("Maximum: " + sol);

    }
    //Square method containing algorithm and prompts
    private static void Square () {
        Scanner keyboard = new Scanner(System.in);
        int num1, sol;
        System.out.println("Selection: Square");
        System.out.print("Enter your first number: ");
        num1 = keyboard.nextInt();

        sol = num1 * num1;

        System.out.println("First Number: " + num1);
        System.out.println("Square: " + sol);

        opfile.println("Selection: Square");
        opfile.println("First Number: " + num1);
        opfile.println("Square: " + sol);

    }
}