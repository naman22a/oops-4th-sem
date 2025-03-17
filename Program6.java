
// Final class: Cannot be inherited
final class FinalClass {

    // Final variable: Cannot be modified after initialization
    final int MAX_LIMIT = 100;

    // Final method: Cannot be overridden by subclasses
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Uncommenting below will cause an error
// class SubClass extends FinalClass {} // Error: Cannot inherit from final class
public class Program6 {

    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final Variable: " + obj.MAX_LIMIT);
        obj.display();

        // Uncommenting below will cause an error
        // obj.MAX_LIMIT = 200; // Error: Cannot assign a value to final variable
    }
}
