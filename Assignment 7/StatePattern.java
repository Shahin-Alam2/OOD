public class StatePattern {
    public static void main(String[] args) {
        VMachine vendingMachine = new VMachine(3);

        vendingMachine.insertDollar();
        vendingMachine.dispenseItem();

        vendingMachine.insertDollar();
        vendingMachine.ejectMoney();

        vendingMachine.insertDollar();
        vendingMachine.dispenseItem();
    }
}
