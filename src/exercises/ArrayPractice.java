package exercises;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String args[]) {
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] greenEggs = seuss.split("\\.");
        System.out.println(Arrays.toString(greenEggs));
    }
}
