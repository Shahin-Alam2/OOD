public class IdleState implements VMachineState {
    @Override
    public void insertDollar(VMachine vendingMachine) {
        System.out.println("Dollar Inserted. Select an item plz:");
        vendingMachine.setState(new HasDollarState());
    }

    @Override
    public void ejectMoney(VMachine vendingMachine) {
        System.out.println("No Money to return.");
    }

    @Override
    public void dispenseItem(VMachine vendingMachine) {
        System.out.println("Payment Required. Insert a Dollar.");
    }
}