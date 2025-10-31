class BankAccount {
    private double balance;   // hidden (Encapsulation)

    // Default constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Parameterized constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed! Not enough balance or invalid amount.");
            return false;
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(500.0);
        acc1.displayBalance();

        acc1.deposit(200);
        acc1.withdraw(150);
        acc1.withdraw(700);  // Should fail
        acc1.displayBalance();
    }
}
