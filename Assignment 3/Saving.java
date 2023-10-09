import java.math.BigDecimal;

public class Saving implements bankAcc {
    private int accountNumber;
    private BigDecimal balance;

    public Saving(BigDecimal initialAmount) {
        this.balance = initialAmount;
        this.accountNumber = getAccountNumber();
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Saving - Deposited $" + amount + ". New balance: $" + balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Saving - Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Saving - Insufficient funds.");
        }
    }

    @Override
    public void transfer(bankAcc toAccount, BigDecimal amount) {
        withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transferred $" + amount + " from saving to another account.");
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
