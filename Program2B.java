
import java.util.Scanner;

public class Program2B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();

        System.out.println("Factorial: " + factorial(n));

    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
