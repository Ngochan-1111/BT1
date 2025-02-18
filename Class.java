import java.util.ArrayList;

public class Class {
    private String className;
    private String classCode;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Class(String className, String classCode) {
        this.className = className;
        this.classCode = classCode;
    }

    public void addStudent(String firstName, String lastName, String birthDate, String address, String className, double gpa) {
        Student newStudent = new Student(firstName, lastName, birthDate, address, className, gpa);
        students.add(newStudent);
    }

    public void getNumberOfStudentsBelongToRank() {
        int countRankA = 0;
        int countRankB = 0;
        int countRankC = 0;
        int countRankD = 0;
        int countRankUnderD = 0;

        for(Student student : students) {
            if(student.getGpa() >= 8.5){
                countRankA++;
            } else if(student.getGpa() >= 7.0){
                countRankB++;
            } else if(student.getGpa() >= 5.5){
                countRankC++;
            } else if(student.getGpa() >= 4.0){
                countRankD++;
            } else {
                countRankUnderD++;
            }
        }

        System.out.println("Rank A: " + countRankA);
        System.out.println("Rank B: " + countRankB);
        System.out.println("Rank C: " + countRankC);
        System.out.println("Rank D: " + countRankD);
        System.out.println("Rank under D: " + countRankUnderD);
    }

    public void getStudentInformation() {
        System.out.print("Name: ");
        for(Student student : students) {
            System.out.print(student.getFirstName() + student.getLastName() + " " );
        }
    }

    public String getClassCode() {
        return this.classCode;
    }
}   
