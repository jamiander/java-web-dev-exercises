package exercises;
import java.util.Scanner;
import java.util.Arrays;
public class WhiteRabbit {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("What are you searching for, darling?");
        String[] aliceQuote = quote.split("\\s+");
        String word = input.nextLine();


        /*for(int i = 0; i < aliceQuote.length; i++) {
            if (aliceQuote[i].equalsIgnoreCase(word)) {
                String newQuote = quote.replace(word, "");
                System.out.println(word + " is at the tea party, join us! " +
                        word + " can be found at index: " + Arrays.asList(aliceQuote).indexOf(word) + "  It is " + word.length() + " characters long.  The new quote is: " + newQuote);

                return;
            }
        }
            System.out.println(word + " is not down the rabbit hole.");*/


        String compareWord = word.toLowerCase();

        if (Arrays.asList(aliceQuote).contains(compareWord)) {
            int index = Arrays.asList(aliceQuote).indexOf(compareWord);
            String newQuote = quote.substring(0, index) + quote.substring(index + word.length(), quote.length()-1);
            System.out.println(word + " is at the tea party, join us!" +
                    " The word can be found at index: " + Arrays.asList(aliceQuote).indexOf(compareWord) + "  It is " + word.length() + " characters long.  The new quote is: " + newQuote);

        } else {
            System.out.println(word + " is not down the rabbit hole.");
        }

    }
}
