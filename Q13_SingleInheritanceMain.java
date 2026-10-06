public class Q13_SingleInheritanceMain {
    public static void main(String[] args) {
        Q13_Pharmacist pharmacist =
            new Q13_Pharmacist(101, "Anshika", 45000, "LIC123");

        pharmacist.displayPharmacist();
    }
}

class Q13_Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    Q13_Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

class Q13_Pharmacist extends Q13_Employee {
    private String licenseNo;

    Q13_Pharmacist(int employeeId, String employeeName,
                   double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("License No: " + licenseNo);
    }
}