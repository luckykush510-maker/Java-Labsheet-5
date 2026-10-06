public class Q3_PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("City Pharmacy", "Dehradun");
        Pharmacy p2 = new Pharmacy("Health Care", "Haridwar");
        Pharmacy p3 = new Pharmacy("Life Pharmacy", "Roorkee");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();

        p1.displayPharmacyCount();
    }
}

class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName);
        System.out.println("Location: " + location);
    }

    void displayPharmacyCount() {
        System.out.println("Total Pharmacies: " + pharmacyCount);
    }
}
