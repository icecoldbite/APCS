package CH10_ArrayList;

public class MyLawFirmV1 {
    public static void main(String[] args) {
        EmployeeV1[] myEmployees = new EmployeeV1[]{new SecretaryV1("Charlie", 3),
                new MarketerV1("Ahmed", 8),
                new LegalSecretaryV1("Jackson", 1)};


        printInfo(myEmployees);

    }

    public static void printInfo(EmployeeV1[] employees) {  //For every employee in the employees list, print out their info
        for(EmployeeV1 employee : employees) {
            System.out.println(employee.getName());
            System.out.println("Salary: $" + employee.getSalary());
            System.out.println("Hours: " + employee.getHours());
        }

        /*for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
            System.out.println("Salary: $" + employees[i].getSalary());
            System.out.println("Hours: " + employees[i].getHours());
        } */
    }
}
