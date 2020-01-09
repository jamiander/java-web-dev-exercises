package org.launchcode.java.studios.countingcharacters;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class ReadFromFile {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File ("/Users/JamieAndersen/Desktop/Jamie's stuff/2 Year Plan.docx");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            System.out.println(read.nextLine());
        }
    }
}
