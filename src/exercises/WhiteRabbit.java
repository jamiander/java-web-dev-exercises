package exercises;
import java.util.Scanner;
import java.util.Arrays;
public class WhiteRabbit {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("What are you searching for, darling?");
        String[] aliceQuote = quote.toLowerCase().split("\\s+");
        String word = input.nextLine();
        if(Arrays.asList(aliceQuote).contains(word.toLowerCase())) {
            System.out.println(word + " is at the tea party, join us!");
        } else {
            System.out.println(word + " is not down the rabbit hole.");
        }

    }
}
