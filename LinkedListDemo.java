import java.util.LinkedList;
import java.util.Random;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create LinkedList object
        LinkedList<Integer> list = new LinkedList<>();

        // Insert 25 random integers from 0 to 100 into the LinkedList
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            list.add(rand.nextInt(101)); // Generates a random integer from 0 to 100
        }

        // Sort the elements
        list.sort(null);

        // Print the sorted list
        System.out.println("Sorted List: " + list);

        // Calculate the sum of the elements
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        // Calculate the floating-point average of the elements
        double average = (double) sum / list.size();

        // Print the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
