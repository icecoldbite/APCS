package CH10_ArrayList;

public class LawyerV1 extends EmployeeV1 {

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
