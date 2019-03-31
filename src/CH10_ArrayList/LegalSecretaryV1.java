package CH10_ArrayList;

public class LegalSecretaryV1 extends EmployeeV1 {

    public LegalSecretaryV1(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public LegalSecretaryV1(String name) {
        super(name);
    }

    public void prepareDocument(String document) {
        System.out.println("I will file "+ document);
    }

    public double getSalary() {

        return 45000.0; // $45,000.00 / year

    }
}
