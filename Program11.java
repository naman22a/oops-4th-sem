
import java.io.*;

public class Program11 {

    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));

            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            System.out.println("Contents of " + sourceFile + ":\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("\nContent copied to " + destinationFile + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
