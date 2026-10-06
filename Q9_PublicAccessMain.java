public class Q9_PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.hospitalName = "City Hospital";
        hospital.hospitalCode = "H101";

        System.out.println("Hospital Name: " + hospital.hospitalName);
        System.out.println("Hospital Code: " + hospital.hospitalCode);

        hospital.displayHospital();
    }
}

class Hospital {
    // Public members can be accessed directly from another class.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "H001";
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Code: " + hospitalCode);
    }
}
