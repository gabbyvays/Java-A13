import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Remove punctuation and convert to lowercase
        String cleanedSentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the sentence into words
        String[] words = cleanedSentence.split("\\s+");

        // Count occurrences of each word
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Count the number of duplicate words
        int duplicateCount = 0;
        for (int count : wordCountMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        // Print the number of duplicate words
        System.out.println("Number of duplicate words: " + duplicateCount);
    }
}
