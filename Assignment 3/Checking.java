import java.math.BigDecimal;

public class Checking implements bankAcc {
    private int accountNumber;
    private BigDecimal balance;

    public Checking(BigDecimal initialAmount) {
        this.balance = initialAmount;
        this.accountNumber = getAccountNumber();
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Checking - Deposited $" + amount + ". New balance: $" + balance);

    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Checking - Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Checking - Insufficient funds balance.");
        }
    }

    @Override
    public void transfer(bankAcc toAccount, BigDecimal amount) {
        withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transferred $" + amount + "from checking to another account.");
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
