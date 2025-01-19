
import java.util.Random;

public class Program01 {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("Random number: " + num);

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
