public class Lecturer extends Employee {
    private String subject;
    private String department; // Added variable as per activity 2.1

    // Constructor using super() to call parent constructor
    public Lecturer(String id, String name, String subject, String department) {
        super(id, name);
        this.subject = subject;
        this.department = department;
    }

    // Method to display subject and department
    public void displaySubject() {
        System.out.println("Subject     : " + this.subject);
        System.out.println("Department  : " + this.department);
    }
}