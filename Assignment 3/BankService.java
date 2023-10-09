import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, bankAcc> bankAcc;

    public BankService() {
        this.bankAcc = new Hashtable<Integer, bankAcc>();
    }

    public int createNewAccount(String type, BigDecimal initAmount) {
        bankAcc newAccount = null;
        switch (type) {
            case "Checking":
                newAccount = new Checking(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                System.out.println("Invalid account type.");
                break;
        }
        if (newAccount != null) {
            this.bankAcc.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;

    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        bankAcc toAccount = this.bankAcc.get(to);
        bankAcc fromAccount = this.bankAcc.get(from);

        if (toAccount != null && fromAccount != null) {
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("Invalid account to transfer");
        }
    }
}
