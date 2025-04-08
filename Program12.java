
import java.io.*;

public class Program12 {

    public static void main(String[] args) {
        String filename = "input.txt"; // Input file

        int charCount = 0;
        int wordCount = 0;
        int vowelCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                // Count characters
                charCount += line.length();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count vowels
                for (char c : line.toCharArray()) {
                    if (isVowel(c)) {
                        vowelCount++;
                    }
                }
            }

            reader.close();

            System.out.println("File analyzed: " + filename);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Total Words     : " + wordCount);
            System.out.println("Total Vowels    : " + vowelCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
