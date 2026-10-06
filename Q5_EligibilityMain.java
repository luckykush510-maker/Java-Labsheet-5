public class Q5_EligibilityMain {
    public static void main(String[] args) {
        Q5_Medicine medicine = new Q5_Medicine("Paracetamol", 18);

        System.out.println("Age 20: " + medicine.checkEligibility(20));
        System.out.println("Age 15: " + medicine.checkEligibility(15));
    }
}

class Q5_Medicine {
    String medicineName;
    int ageLimit;

    Q5_Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        String result;

        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }

        return result;
    }
}
