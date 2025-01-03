public class BankingSystem {
    public static void main(String[] args) {
        Account account1 = new Account("12345", 5000);
        Account account2 = new Account("67890", 3000);

        Customer customer1 = new Customer("Beksultan", account1);
        Customer customer2 = new Customer("Sanjar", account2);

        Bank bank = new Bank("Java Bank", 10);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.listCustomers();

        account1.deposit(1000);
        account2.withdraw(500);

        System.out.println("Comparison:");
        System.out.println(account1.getBalance() > account2.getBalance() ?
                "Beksultan has more balance." : "Sanjar has more balance.");
    }
}
