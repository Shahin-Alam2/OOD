import java.util.*;

public class BankServices {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();

        bankFacade.depositToChecking(1500.0);
        bankFacade.withdrawFromChecking(500.0);
        bankFacade.displayCheckingBalance();

        bankFacade.applyInterestToSavings();
        bankFacade.displaySavingsBalance();

        bankFacade.investInInvestment(700.0);
        bankFacade.displayInvestmentBalance();
    }
}