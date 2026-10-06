public class Q19_HospitalStaffMain {
    public static void main(String[] args) {
        Q19_Employee[] staff = {
            new Q19_Doctor(101, "Anshika", 30, 60000, "Cardiology"),
            new Q19_Pharmacist(102, "Riya", 25, 45000, "LIC789")
        };

        Q19_StaffManager manager = new Q19_StaffManager();
        manager.displayStaff(staff);
    }
}

class Q19_Person {
    protected String name;
    protected int age;

    Q19_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Q19_Employee extends Q19_Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0;

    Q19_Employee(int employeeId, String name, int age, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Q19_Doctor extends Q19_Employee {
    private String specialization;

    Q19_Doctor(int employeeId, String name, int age,
               double salary, String specialization) {
        super(employeeId, name, age, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor");
        System.out.println("Specialization: " + specialization);
    }
}

class Q19_Pharmacist extends Q19_Employee {
    private String licenseNo;

    Q19_Pharmacist(int employeeId, String name, int age,
                   double salary, String licenseNo) {
        super(employeeId, name, age, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist");
        System.out.println("License No: " + licenseNo);
    }
}

class Q19_StaffManager {
    void displayStaff(Q19_Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Q19_Doctor) {
                Q19_Doctor doctor = (Q19_Doctor) staff[i];
                doctor.displayDoctor();
            } else if (staff[i] instanceof Q19_Pharmacist) {
                Q19_Pharmacist pharmacist = (Q19_Pharmacist) staff[i];
                pharmacist.displayPharmacist();
            }

            System.out.println();
        }

        System.out.println("Total Employees: " + Q19_Employee.employeeCount);
    }
}