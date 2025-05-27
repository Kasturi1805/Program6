//package Program6;

public class Bank_transaction {
    String account_name;          // SBI, Canara, Bank_of_Baroda
    String accountholder_name;
    String account_type;          // saving, business
    long account_number;
    double balance;

    // Constructor
    public Bank_transaction(String account_name, String accountholder_name, String account_type, long account_number, double balance) {
        this.account_name = account_name;
        this.accountholder_name = accountholder_name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance = balance;
    }

    // Display method
    public void display() {
        System.out.println("Bank Name: " + account_name);
        System.out.println("Account Holder: " + accountholder_name);
        System.out.println("Account Type: " + account_type);
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: $" + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Bank_Transaction object
        Bank_transaction transaction = new Bank_transaction(
            "Canara Bank",
            "Anita Desai",
            "saving",
            9876543210123456L,
            25300.75
        );

        // Display transaction details
        transaction.display();
    }
}
