public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String className;
    private double gpa;

    public Student(String firstName, String lastName, String birthDate, String address, String className, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.className = className;
        this.gpa = gpa;
    }
    
    public double getGpa() {
        return this.gpa;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
