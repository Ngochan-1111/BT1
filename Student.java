public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String className;
    private double oop;
    private double qlyDuAn;
    private double machineLearing;
    private double csdl;
    private double android;


    public Student(String firstName, String lastName, String birthDate, String address, String className, double oop, double qlyDuAn, double machineLearing, double csdl, double android) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.className = className;
        this.oop = oop;
        this.qlyDuAn = qlyDuAn;
        this.machineLearing = machineLearing;
        this.csdl = csdl;
        this.android = android;
    }
    
    public double getGpa() {
        return (this.oop + this.qlyDuAn + this.android + this.machineLearing + this.csdl) / 5 ;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
