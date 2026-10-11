import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StopWordFilteredWordFrequency {

    public static void printFilteredWordFrequency(String feedback) {
        Set<String> stopWords = new HashSet<>(
            Arrays.asList("the", "was", "and", "a", "is", "of", "in")
        );

        String cleaned = feedback.toLowerCase()
                                 .replace(".", "")
                                 .replace(",", "");
        String trimmed = cleaned.trim();

        if (trimmed.isEmpty()) {
            System.out.println("No words to count.");
            return;
        }

        String[] words = trimmed.split("\\s+");
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (!stopWords.contains(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        frequency.entrySet().stream()
                 .sorted((first, second) ->
                     second.getValue().compareTo(first.getValue()))
                 .forEach(entry ->
                     System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter feedback paragraph:");
        String feedback = scanner.nextLine();

        printFilteredWordFrequency(feedback);
        scanner.close();
    }
}
