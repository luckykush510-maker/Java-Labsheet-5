public class Q7_PatientMain {
    public static void main(String[] args) {
        Q7_Patient patient = new Q7_Patient("Anshika", 20, 55.5);

        patient.setAge(21);
        patient.setAge(-5);

        patient.setWeight(56.0);
        patient.setWeight(-10);

        patient.displayPatient();
    }
}

class Q7_Patient {
    private String patientName;
    private int age;
    private double weight;

    Q7_Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void displayPatient() {
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}