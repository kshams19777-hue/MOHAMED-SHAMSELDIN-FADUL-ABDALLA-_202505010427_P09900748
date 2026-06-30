public class Student {
    // Declaring private variables for encapsulation
    private String studentID;
    private String name;
    private double cgpa;
    private String programme; // Added variable as per activity 3

    // Setter and Getter for studentID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return this.studentID;
    }

    // Setter and Getter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Setter and Getter for cgpa
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    // Setter and Getter for programme (Activity 3)
    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getProgramme() {
        return this.programme;
    }
}