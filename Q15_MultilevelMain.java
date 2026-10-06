public class Q15_MultilevelMain {
    public static void main(String[] args) {
        Q15_Manager manager =
            new Q15_Manager("Ananya", 32, 101, 8);

        manager.displayManager();
    }
}

class Q15_Person {
    protected String name;
    protected int age;

    Q15_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Q15_Employee extends Q15_Person {
    private int employeeId;

    Q15_Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    protected int getEmployeeId() {
        return employeeId;
    }
}

class Q15_Manager extends Q15_Employee {
    private int teamSize;

    Q15_Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team Size: " + teamSize);
    }
}