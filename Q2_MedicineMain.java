 public class Q2_MedicineMain {
    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("Paracetamol", "B101", 50.0);
        Medicine medicine2 = new Medicine("Amoxicillin", "B202", 120.0);

        medicine1.displayMedicine();
        medicine2.displayMedicine();
    }
}

class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
