public class Q8_BankAccountMain {
    public static void main(String[] args) {
        BankAccount account =
            new BankAccount(1001, "Anshika", 5000.0);

        account.deposit(2000.0);
        account.withdraw(1500.0);
        account.displayAccount();
    }
}

class BankAccount {
    private int accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        boolean success;

        if (amount <= balance) {
            balance -= amount;
            success = true;
        } else {
            success = false;
        }

        System.out.println("Withdrawal Successful: " + success);
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
