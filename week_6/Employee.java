public class Employee {
    protected String id;
    protected String name;

    // Constructor
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Employee ID : " + this.id);
        System.out.println("Name        : " + this.name);
    }
}