package CH10_ArrayList;

public class EmployeeV1 {

    private String name;
    private int yearsOfExperience;

    public EmployeeV1(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public EmployeeV1(String name) {
        this.name = name;
        this.yearsOfExperience = 0;
    }

    public int getHours(){
        return 40;
    }

    public double getSalary() {

        return 40000.0; // $40,000.00 / year

    }

    public String getName() {
        return this.name;
    }

    public int getVacationDays() {

        return 10; // 2 weeks' paid vacation

    }

    public String getVacationForm() {

        return "yellow"; // use the yellow form

    }

}
