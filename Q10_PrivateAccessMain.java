public class Q10_PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee =
            new Employee(101, "Anshika", 45000);

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());

        employee.displayEmployee();

        // employee.salary = 50000;
        // Direct access to private variable is not allowed.
    }
}

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}
