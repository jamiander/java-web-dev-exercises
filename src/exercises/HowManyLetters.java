package exercises;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class HowManyLetters {
    public static void main(String args[]) {
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String greenEggs[] = seuss.split(" ");
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList(greenEggs));
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number, any number: ");
        int num = input.nextInt();
        for (String word : words) {
            if (word.length() == num) {
                System.out.println(word);
            }
        }
    }
}
