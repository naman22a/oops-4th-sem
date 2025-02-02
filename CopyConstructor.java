
class Person {

    String name;
    int age;

    Person() {
        name = "";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}

public class CopyConstructor {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Naman";
        p1.age = 20;
        p1.display();

        Person p2 = new Person("Vasav", 19);
        p2.display();

        // p1, p2, p3 in different memory location
        Person p3 = new Person(p1);
        p3.display();

    }
}
