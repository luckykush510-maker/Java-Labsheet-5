public class Q6_MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product =
            new MedicineProduct("Paracetamol", "B101", 50.0);

        product.setPrice(60.0);

        System.out.println("Medicine Name: " + product.getMedicineName());
        System.out.println("Updated Price: " + product.getPrice());

        product.displayProduct();
    }
}

class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Price: " + price);
    }
}
