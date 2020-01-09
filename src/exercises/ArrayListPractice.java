package exercises;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String args[]) {
        ArrayList<Integer> items = new ArrayList<>(
        Arrays.asList(2,6,8,4,7,9,2,12,13,14));
        int sum = 0;
        for (int item : items) {
            if (item % 2 == 0) {
                sum += item;
            }
        }
        System.out.println(sum);
    }
}
