public class JacksonDerbyClassroom {
    private String teacherName;
    private int numberOfStudents;
    private int numberOfDesks;
    private boolean enoughDesks;
    private boolean hasSupplies;
    private double width;
    private double length;
    private String subject;
    private boolean hasSmartboard;

    public JacksonDerbyClassroom(String teacherName, int numberOfStudents, int numberOfDesks, boolean enoughDesks, boolean hasSupplies, double width, double length, String subject, boolean hasSmartboard) {
        this.teacherName = teacherName;
        this.numberOfStudents = numberOfStudents;
        this.numberOfDesks = numberOfDesks;
        this.enoughDesks = enoughDesks;
        this.hasSupplies = hasSupplies;
        this.width = width;
        this.length = length;
        this.subject = subject;
        this.hasSmartboard = hasSmartboard;

    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfDesks() {
        return numberOfDesks;
    }

    public void setNumberOfDesks(int numberOfDesks) {
        this.numberOfDesks = numberOfDesks;
    }

    public boolean isEnoughDesks() {
        return enoughDesks;
    }

    public void setEnoughDesks(boolean enoughDesks) {
        this.enoughDesks = enoughDesks;
    }

    public boolean isHasSupplies() {
        return hasSupplies;
    }

    public void setHasSupplies(boolean hasSupplies) {
        this.hasSupplies = hasSupplies;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isHasSmartboard() {
        return hasSmartboard;
    }

    public void setHasSmartboard(boolean hasSmartboard) {
        this.hasSmartboard = hasSmartboard;
    }

    @Override
    public String toString() {
        return "The teacher name is " + teacherName + ", The number of students is " + numberOfStudents + ", The number of desks: " + numberOfDesks + ", The classroom has enough desks for the students is " +
                enoughDesks + ", The classroom has enough supplies is " + hasSupplies + ", The width of the classroom is " + width + ", The length of the classroom is " + length + ", The subject taught" + subject +
                ", The classroom has a smartboard is " + hasSmartboard;
    }
}
