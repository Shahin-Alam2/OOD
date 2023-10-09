class InvestmentAccount extends BankAccount {
    public InvestmentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void invest(double amount) {
        if (getBalance() >= amount) {
            withdraw(amount);
            System.out.println("Invested: $" + amount);
        } else {
            System.out.println("Insufficient balance to invest");
        }
    }
}