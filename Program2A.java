
import java.util.Scanner;

public class Program2A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Enter n: ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Invalid");
        } else if (n == 1) {
            System.out.println(0);
        } else {
            int first = 0;
            int second = 1;
            System.out.print(first + " " + second + " ");

            for (int i = 0; i < n - 2; i++) {
                int next = first + second;
                System.err.print(next + " ");
                first = second;
                second = next;
            }
            System.err.println();
        }

    }
}
