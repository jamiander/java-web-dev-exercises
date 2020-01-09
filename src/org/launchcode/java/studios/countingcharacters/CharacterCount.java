package org.launchcode.java.studios.countingcharacters;
import java.util.*;
import java.io.File;

public class CharacterCount {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me something interesting...");
        String quote = input.nextLine().toLowerCase();
        char[] letters = quote.toCharArray();
        Map<Character, Integer> letterCount= new HashMap<>();
        char character;


        for (int i=0; i < letters.length; i++) {
            int count = 0;
            if (Character.isLetter(letters[i])) {
                if (!letterCount.containsKey(letters[i])) {
                    character = letters[i];
                    for (int j = 0; j < letters.length; j++) {
                        if (letters[j] == character) {
                            count++;
                        }
                    }
                    letterCount.put(character, count);
                }
            }
        }

        for (Map.Entry<Character, Integer> letterCounts : letterCount.entrySet()) {
            System.out.println(letterCounts.getKey() + " : " + letterCounts.getValue());
        }

    }
}
