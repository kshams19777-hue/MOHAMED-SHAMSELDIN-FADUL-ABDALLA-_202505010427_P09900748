public class main {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student student = new Student();

        // Setting values using setter methods
        student.setStudentID("CU12345");
        student.setName("mohe");
        student.setCGPA(3.80);
        student.setProgramme("BCSSE");

        // Displaying the output using getter methods
        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme: " + student.getProgramme());
    }
}