class BankFacade {
    private BankAccount checkingAccount;
    private SavingsAccount savingsAccount;
    private InvestmentAccount investmentAccount;

    public BankFacade() {
        checkingAccount = new BankAccount("123", 1500.0);
        savingsAccount = new SavingsAccount("456", 2000.0, 2.5);
        investmentAccount = new InvestmentAccount("987", 3000.0);
    }

    public void depositToChecking(double amount) {
        checkingAccount.deposit(amount);
    }

    public void withdrawFromChecking(double amount) {
        checkingAccount.withdraw(amount);
    }

    public void displayCheckingBalance() {
        checkingAccount.displayBalance();
    }

    public void applyInterestToSavings() {
        savingsAccount.applyInterest();
    }

    public void displaySavingsBalance() {
        savingsAccount.displayBalance();
    }

    public void investInInvestment(double amount) {
        investmentAccount.invest(amount);
    }

    public void displayInvestmentBalance() {
        investmentAccount.displayBalance();
    }
}