import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String classCode;

        Class class1 = new Class("12A1", "D120001");
        class1.addStudent("Nguyen", "Hiep", "01/01/2000", "Hanoi", "12A1", 8.0);
        class1.addStudent("Pham", "Hiep", "01/01/2000", "Hanoi", "12A1", 7.0);
        class1.addStudent("Nguyen", "Na", "01/01/2000", "Hanoi", "12A1", 6.0);
        class1.addStudent("Pham", "Na", "01/01/2000", "Hanoi", "12A1", 5.0);
        class1.addStudent("Nguyen", "Han", "01/01/2000", "Hanoi", "12A1", 4.0);
        class1.addStudent("Pham", "Han", "01/01/2000", "Hanoi", "12A1", 3.0);
        class1.addStudent("Nguyen", "Duy", "01/01/2000", "Hanoi", "12A1", 2.0);
        class1.addStudent("Pham", "Duy", "01/01/2000", "Hanoi", "12A1", 1.0);
        class1.addStudent("Nguyen", "Nguyen", "01/01/2000", "Hanoi", "12A1", 9.0);

        Class class2 = new Class("12A2", "D120002");
        class2.addStudent("Bui", "Hiep", "01/01/2000", "Hanoi", "12A2", 8.0);
        class2.addStudent("Mai", "Hiep", "01/01/2000", "Hanoi", "12A2", 7.0);
        class2.addStudent("Kia", "Na", "01/01/2000", "Hanoi", "12A2", 6.0);
        class2.addStudent("Qua", "Na", "01/01/2000", "Hanoi", "12A2", 5.0);
        class2.addStudent("Ma", "Han", "01/01/2000", "Hanoi", "12A2", 4.0);
        class2.addStudent("Phi", "Han", "01/01/2000", "Hanoi", "12A2", 3.0);

        System.out.println("Enter class code: ");
        Scanner sc = new Scanner(System.in);
        classCode = sc.next();

        if(classCode.equals(class1.getClassCode())) {
            class1.getNumberOfStudentsBelongToRank();
            class1.getStudentInformation();
        } else if(classCode == class2.getClassCode()) {
            class2.getNumberOfStudentsBelongToRank();
            class2.getStudentInformation();
        } else {
            System.out.println("Class code is not valid");
        }
    }
}
