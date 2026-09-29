public class BankAccount {

    // Fields
    String accountHolder;
    long accountNumber;
    double balance;

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }

    public static void main(String[] args) {

        // Creating an object
        BankAccount account1 = new BankAccount();

        // Assigning values
        account1.accountHolder = "Chinnu";
        account1.accountNumber = 1234567890L;
        account1.balance = 25000.00;

        // Calling method
        account1.displayAccountDetails();
    }
}