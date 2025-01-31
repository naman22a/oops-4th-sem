
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        float avg = total / (float) arr.length;
        System.out.println("Average: " + avg);

    }
}
