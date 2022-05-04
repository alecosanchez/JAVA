import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class wordCountSrc {

        public static void main(String[] args) throws IOException {
            //declaring arrays that are big enough to not have to worry about.
            String words[] = new String[1000];
            int counts[] = new int[1000];
            //Scanner object reads inout file...
            File myFile = new File("src/plaintext.txt");
            Scanner ipFile = new Scanner(myFile);
            //variable declaration
            int nums = 0;
            String seuss = null;

            //looping through each element until there is none left
            while (ipFile.hasNext()) {
                seuss = ipFile.nextLine();
                //split() method breaks a given string around matches of the given regular expression.
                String allwords[] = seuss.split("\\s+");
                for(String word: allwords)
                    nums = WordF(words, counts, word,nums);
            }
            ipFile.close();
            sortbyalpha(words, counts, nums);
            output(words, counts, nums);
        }
        public static int WordF(String words[], int counts[], String newWord, int numEntries) {
            //setting all words to lowercase for uniformity.
            newWord = newWord.toLowerCase();
            for (int i = 0; i < numEntries; i++) {
                if(newWord.equals(words[i])) {
                    counts[i] += 1;
                    return numEntries;
                } }
            words[numEntries] = newWord;
            counts[numEntries++] = 1;
            return numEntries;
        }
        //This method will take all of the isolated words and sort them alphabetically.
        public static void sortbyalpha(String words[], int count[], int numEntries) {
            int t = 0, i = 0, j = 0;
            String value;
            for (i = 0; i < numEntries; i++) {
                for (j = i + 1; j < numEntries; j++) {
                    if (words[i].compareTo(words[j]) > 0) {
                        value = words[i];
                        words[i] = words[j];
                        words[j] = value;
                        t = count[i];
                        count[i] = count[j];
                        count[j] = t;
                    } } } }
        public static void output(String words[], int count[], int numEntries) throws IOException {
            //Creating print writer for the output file.
            PrintWriter opfile;
            opfile = new PrintWriter("opfile.txt");
            //looping through the data to print the words and every instance of that word.
            for (int i = 0; i < numEntries; i++) {
                opfile.println(words[i] + " " + count[i]);
            }
            // close the output file
            opfile.close();
        }
    }

