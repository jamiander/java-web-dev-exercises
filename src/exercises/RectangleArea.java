package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of rectangle:");
        int length = input.nextInt();
        System.out.println("Width of rectangle:");
        int width = input.nextInt();
        System.out.println("The area of the rectangle: " + length * width);
    }
}
