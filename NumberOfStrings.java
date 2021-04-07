package Cars;

import Files.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) throws FileNotFoundException {
        File readMe = new File("resources/readMe.csv");

        Scanner fileScanner = new Scanner(readMe);
        //String currentLine = fileScanner.nextLine();

        ArrayList<String> wordList = new ArrayList<String>();
        int amountOfWords = 0;
        int amountOfLines = 0;

        while(fileScanner.hasNextLine()){
            String currentLine = fileScanner.nextLine();
            String[] wordsOnLine = currentLine.split(" ");

            amountOfLines++;
            amountOfWords += wordsOnLine.length;
        }

        System.out.println("amount of strings in file, if each line is a string: " + amountOfLines);
        System.out.println("amount of Strings in file, if strings are separated by spaces too: " + amountOfWords);
    }
}
