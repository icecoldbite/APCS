public class JacksonDerbyStudent {
    private String name;
    private int grade;
    private  String school;
    private char gender;
    private int studentID;
    private double gpa;
    private int dateOfBirth;
    private String[] schedule;
    private String address;
    private String counselor;

    public JacksonDerbyStudent(String name, int dateOfBirth, char gender, String address, int grade) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.grade = grade;
    }

    public JacksonDerbyStudent(String name, int dateOfBirth, char gender, String address, int grade, double gpa) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    public char getGender() {
        return gender;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getAddress() {
        return address;
    }

    public String getCounselor() {
        return counselor;
    }

    public String toString() {
        return "Student: " + name + ", Date of birth: " + dateOfBirth + ", Gender: " + gender + ", Address: " + address + ", Grade: " + grade;
    }
}
