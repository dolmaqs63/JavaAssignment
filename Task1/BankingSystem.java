public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("Nepal Rastra Bank");
        bank.displayBankInfo();

        Account acc1 = new Account("1234567889", 5000.0);
        Customer cust = new Customer("Prabin Nepali", 23, acc1);
        cust.displayCustomerDetails();
        //Perform transactions
        acc1.deposit(1000.0);
        acc1.withdraw(1500);

        System.out.println("\n After Transaction: ");
        cust.displayCustomerDetails();
        //force garbage collection (simulate destructor)
        cust = null;
        acc1 = null;
        System.gc(); // Call finalize
    }
}