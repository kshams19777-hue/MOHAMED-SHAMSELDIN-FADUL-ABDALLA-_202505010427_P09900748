public class Main {
    public static void main(String[] args) {
        // Creating objects with sample names and IDs
        Person p0 = new Person("Generic Person", "000");
        Person p1 = new Student("Ali", "S123");
        Person p2 = new Lecturer("Dr. Ahmed", "L456");

        // Calling methods to print the correct sequence
        p0.introduce();
        p1.introduce();
        p2.introduce();
    }
}