public class Q20_PharmacyEmployeeMain {
    public static void main(String[] args) {
        Q20_Employee[] employees = {
            new Q20_Pharmacist(101, "Anshika", 45000, "LIC123"),
            new Q20_StoreManager(102, "Riya", 50000, 2)
        };

        Q20_EmployeeProcessor processor = new Q20_EmployeeProcessor();
        processor.processEmployees(employees);
    }
}

class Q20_Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    static int employeeCount = 0;

    protected String department = "Pharmacy";

    Q20_Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void showBasicDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    void displayRole() {
        System.out.println("Role: Employee");
    }
}

class Q20_Pharmacist extends Q20_Employee {
    private String licenseNo;

    Q20_Pharmacist(int employeeId, String employeeName,
                   double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayRole() {
        System.out.println("Role: Pharmacist");
        System.out.println("License No: " + licenseNo);
    }
}

class Q20_StoreManager extends Q20_Employee {
    private int storeSection;

    Q20_StoreManager(int employeeId, String employeeName,
                     double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayRole() {
        System.out.println("Role: Store Manager");
        System.out.println("Store Section: " + storeSection);
    }
}

class Q20_EmployeeProcessor {
    void processEmployees(Q20_Employee[] employees) {
        int i;
        double totalSalary = 0;

        for (i = 0; i < employees.length; i++) {
            employees[i].showBasicDetails();
            employees[i].displayRole();

            totalSalary += employees[i].getSalary();

            if (employees[i].getSalary() >= 50000) {
                System.out.println("Salary Category: High");
            } else {
                System.out.println("Salary Category: Standard");
            }

            System.out.println();
        }

        System.out.println("Total Employees: " + Q20_Employee.employeeCount);
        System.out.println("Total Salary: " + totalSalary);
    }
}