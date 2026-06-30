public class main {
    public static void main(String[] args) {
        // Creating Lecturer object with your name and specialization
        Lecturer lecturer = new Lecturer("L100", "mohe", "Java Programming", "Computer Science");

        // Displaying all details using inherited and class-specific methods
        lecturer.displayInfo();
        lecturer.displaySubject();
    }
}