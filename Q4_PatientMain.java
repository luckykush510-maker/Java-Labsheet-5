public class Q4_PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(101, "Anshika", 20),
            new Patient(102, "Riya", 22),
            new Patient(103, "Neha", 25),
            new Patient(104, "Priya", 30),
            new Patient(105, "Kavya", 28)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}

class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        int i;

        for (i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}
