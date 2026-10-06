public class Q16_MedicalStaffMain {
    public static void main(String[] args) {
        Q16_Doctor doctor =
            new Q16_Doctor(101, "Anshika", "Cardiology");

        Q16_Pharmacist pharmacist =
            new Q16_Pharmacist(102, "Riya", "LIC456");

        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}

class Q16_MedicalStaff {
    protected int staffId;
    protected String staffName;

    Q16_MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

class Q16_Doctor extends Q16_MedicalStaff {
    private String specialization;

    Q16_Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor ID: " + staffId);
        System.out.println("Doctor Name: " + staffName);
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Q16_Pharmacist extends Q16_MedicalStaff {
    private String licenseNo;

    Q16_Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Pharmacist ID: " + staffId);
        System.out.println("Pharmacist Name: " + staffName);
        System.out.println("License No: " + licenseNo);
    }
}