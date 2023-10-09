import java.math.BigDecimal;

public class Investment implements bankAcc {
    private int accountNumber;
    private BigDecimal balance;

    public Investment(BigDecimal initialAmount) {
        this.balance = initialAmount;
        accountNumber = getAccountNumber();
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Investment - Deposited $" + amount + ". New balance: $" + balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Investment - Withdrawn $" + amount + ". New balance $" + balance);
        } else {
            System.out.println("Investment - Insufficient funds.");
        }
    }

    @Override
    public void transfer(bankAcc toAccount, BigDecimal amount) {
        withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transferred $" + amount + " from Investment to another account.");
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

}