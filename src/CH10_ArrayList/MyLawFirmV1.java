package CH10_ArrayList;

public class MyLawFirmV1 {
    public static void main(String[] args) {
        EmployeeV1[] myEmployees = new EmployeeV1[]{new LawyerV1(),
                new SecretaryV1(),
                new MarketerV1()};


    }

    public static void printInfo(EmployeeV1[] employees) {
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary());
            System.out.println(employees[i].getHours());
        }
    }
}
