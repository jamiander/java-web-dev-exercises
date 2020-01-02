package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas were used?");
        int gallons = input.nextInt();
        System.out.println("Your car used " + miles/gallons + " miles per gallon");
    }
}
