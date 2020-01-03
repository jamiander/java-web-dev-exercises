package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("What word are you looking for, my dear?");
        String word = input.nextLine();
        String compareWord = word.toLowerCase();
        int intIndex = quote.toLowerCase().indexOf(compareWord);
        if(quote.toLowerCase().contains(compareWord) && ) {
            String newQuote = quote.substring(0, intIndex) + quote.substring(intIndex + word.length(), quote.length()-1);
            System.out.println(word + " is at the tea party, join us! Your word can be found at index: " + intIndex + "  It is " + word.length() + " characters long.  The new quote is:  '" + newQuote + "'");
        } else {
            System.out.println(word + " is not down the rabbit hole.");
        }
    }
}
