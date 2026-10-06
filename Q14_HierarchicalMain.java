public class Q14_HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor =
            new Doctor("Anshika", 30, "Cardiology");

        Nurse nurse =
            new Nurse("Riya", 25, "General Ward");

        doctor.displayDoctor();
        nurse.displayNurse();
    }
}

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    private String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayPerson();
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Nurse extends Person {
    private String ward;

    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void displayNurse() {
        displayPerson();
        System.out.println("Ward: " + ward);
    }
}
