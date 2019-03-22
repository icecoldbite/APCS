package CH10_ArrayList;

public class MarketerV1 extends EmployeeV1 {

    public MarketerV1(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public MarketerV1(String name) {
        super(name);
    }

    public static void advertise() {
        System.out.println("Show me the money!");
    }

}
