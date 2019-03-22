package CH10_ArrayList;

public class LawyerV1 extends EmployeeV1 {

    public LawyerV1(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public LawyerV1(String name) {
        super(name);
    }

    public double getSalary() {

        return 50000.0; // $40,000.00 / year

    }

    public void sue(){
        System.out.println("I'll see you in court");
    }

    public int getVacationDays() {
        return 15; // 3 weeks' paid vacation
    }

    public String getVacationForm() {
        return "pink"; // use the pink form
    }
}
