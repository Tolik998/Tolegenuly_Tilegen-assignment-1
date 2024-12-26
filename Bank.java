class Bank {
    private String name;
    private Customer[] customers;
    private int customerCount;

    public Bank(String name, int maxCustomers) {
        this.name = name;
        this.customers = new Customer[maxCustomers];
        this.customerCount = 0;
    }

    public void addCustomer(Customer customer) {
        if (customerCount < customers.length) {
            customers[customerCount++] = customer;
        }
    }

    public void listCustomers() {
        System.out.println("Customers of " + name + ":");
        for (int i = 0; i < customerCount; i++) {
            System.out.println(customers[i]);
        }
    }
}