package BT1;
import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    String birthdate;
    String address;
    String className;
    double LTHDT;
    double QLDA;
    double HM;
    double CSDL;
    double LTUD;

    public Student(String a, String b, String c, String d, String e) {
        this.firstName = a;
        this.lastName = b;
        this.birthdate = c;
        this.address = d;
        this.className = e;
    }

    public void Scores(double a, double b, double c, double d, double e) {
        this.LTHDT = a;
        this.QLDA = b;
        this.HM = c;
        this.CSDL = d;
        this.LTUD = e;
    }

    public String Rank() {
        double avg = (LTHDT + QLDA + HM + CSDL + LTUD) / 5;
        if (avg >= 8.5) {
            return "A";
        } else if (avg >= 7.0) {
            return "B";
        } else if (avg >= 5.5) {
            return "C";
        } else if (avg >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}

class Class {
    String className;
    Student[] student;

    public Class(String className, Student[] student) {
        this.className = className;
        this.student = student;
    }

    public void displayStudent() {
        System.out.println("Class: " + className);
        if (student.length == 0) {
            System.out.println("No students in this class.");
        } else {
            System.out.println("List of students: ");
            for (int i = 0; i < student.length; i++) {
                System.out.println(student[i].firstName + " " + student[i].lastName + " Diem: LTHDT: "
                        + student[i].LTHDT + " QLDA: " + student[i].QLDA + " HM: " + student[i].HM
                        + " CSDL: " + student[i].CSDL + " LTUD: " + student[i].LTUD);
            }
        }

        System.out.println("Tong ket ds theo rank:");
        System.out.println("A: " + getRankCount("A"));
        System.out.println("B: " + getRankCount("B"));
        System.out.println("C: " + getRankCount("C"));
        System.out.println("D: " + getRankCount("D"));
        System.out.println("<D: " + getRankCount("F"));
    }

    public int getRankCount(String rank) {
        int count = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].Rank().equals(rank)) {
                count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("John", "Doe", "2000-01-01", "Address 1", "Class 1");
        student1.Scores(9.0, 8.0, 7.0, 6.0, 9.5);

        Student student2 = new Student("Jane", "Doe", "2000-02-01", "Address 2", "Class 1");
        student2.Scores(7.0, 6.0, 5.0, 7.5, 8.0);

        Student[] studentsClass1 = {student1, student2};
        Student[] studentsClass2 = {}; 

        Class class1 = new Class("Class 1", studentsClass1);
        Class class2 = new Class("Class 2", studentsClass2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class code (Class 1 or Class 2): ");
        String classCode = scanner.nextLine();

        
        if (classCode.equals("Class 1")) {
            class1.displayStudent();
        } else if (classCode.equals("Class 2")) {
            class2.displayStudent();
        } else {
            System.out.println("Invalid class code.");
        }

        scanner.close();
    }
}
