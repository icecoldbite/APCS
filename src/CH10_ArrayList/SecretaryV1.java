package CH10_ArrayList;

public class SecretaryV1 extends EmployeeV1 {

    public SecretaryV1(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public SecretaryV1(String name) {
        super(name);
    }

    public static void takeDictation(String text) {
        System.out.println("Taking dictation of " + text);
    }
}
