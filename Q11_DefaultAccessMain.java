public class Q11_DefaultAccessMain {
    public static void main(String[] args) {
        Q11_Pharmacy pharmacy = new Q11_Pharmacy();

        pharmacy.medicineName = "Paracetamol";
        pharmacy.price = 50.0;

        pharmacy.displayMedicine();
    }
}

class Q11_Pharmacy {
    // Default access: no access modifier is used.
    String medicineName;
    double price;

    Q11_Pharmacy() {
        medicineName = "Unknown";
        price = 0.0;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}