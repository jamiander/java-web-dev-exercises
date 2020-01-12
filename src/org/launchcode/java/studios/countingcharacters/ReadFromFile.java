package org.launchcode.java.studios.countingcharacters;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("/Users/JamieAndersen/Desktop/Jamie Andersen Cover Letter-Data Analyst.txt");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            String quote = read.next();
            System.out.println(quote);
        }
        read.close();
    }
}
