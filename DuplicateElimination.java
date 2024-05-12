import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        // List of first names
        String[] firstNames = { "Aaron", "George", "Jill", "Judy", "Aaron", "Jack", "Mary", "Jill", "Aaron", "Mary" };

        // Create a set to store unique names
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateNames = new HashSet<>();

        // Add names to the set, eliminating duplicates
        for (String name : firstNames) {
            if (!uniqueNames.add(name)) {
                // If name already exists in uniqueNames set, add it to duplicates set
                duplicateNames.add(name);
            }
        }

        // Print the unique names
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            if (!duplicateNames.contains(name)) {
                System.out.println(name);
            }
        }

        // Allow the user to search for a first name
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a name to search: ");
            String searchName = scanner.nextLine();

            // Check if the name exists in the set
            if (uniqueNames.contains(searchName) && !duplicateNames.contains(searchName)) {
                System.out.println(searchName + " is found in the list.");
            } else {
                System.out.println(searchName + " is not found in the list.");
            }
        } // Scanner is automatically closed at the end of the try block
    }
}
