
import java.math.BigDecimal;

public class Customer {
    public static void main(String args[]) {
        BankService myBankService = new BankService();
        int mySaving = myBankService.createNewAccount("saving", new BigDecimal(600.00));
        int myInvestment = myBankService.createNewAccount("investment", new BigDecimal(1200.00));
        myBankService.transferMoney(mySaving, myInvestment, new BigDecimal(400.00));
    }
}
