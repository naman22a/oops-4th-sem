
import java.util.Scanner;

class Rectangle {

    float length;
    float breadth;

    public float perimeter() {
        return 2 * (length + breadth);
    }

    public float area() {
        return length * breadth;
    }
}

public class Program4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length: ");

        float length = s.nextFloat();

        System.out.print("Enter breadth: ");
        float breadth = s.nextFloat();

        Rectangle rect = new Rectangle();
        rect.length = length;
        rect.breadth = breadth;

        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("Area: " + rect.area());
    }
}
