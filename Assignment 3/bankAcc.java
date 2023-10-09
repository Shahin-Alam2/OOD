import java.math.BigDecimal;

public interface bankAcc {
    public void deposit(BigDecimal amount);

    public void withdraw(BigDecimal amount);

    public void transfer(bankAcc toAccount, BigDecimal amount);

    public int getAccountNumber();
}
