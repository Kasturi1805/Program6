//package Program6;


    public class Bank_Customer {
    String cust_name;
    int cust_id;
    String cust_address;

    // Constructor
    public Bank_Customer(String cust_name, int cust_id, String cust_address) {
        this.cust_name = cust_name;
        this.cust_id = cust_id;
        this.cust_address = cust_address;
    }

    // Display method
    public void display() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Customer ID: " + cust_id);
        System.out.println("Customer Address: " + cust_address);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a customer object
        Bank_Customer customer = new Bank_Customer("Kasturi", 248, "Mattikal oni,Hubli");

        // Display customer details
        customer.display();
    }
}

    

