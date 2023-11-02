public class OutOfStockState implements VMachineState {
    @Override
    public void insertDollar(VMachine vending_Machine) {
        System.out.println("Out of stock. Money returned.");
        vending_Machine.returnMoney();
    }

    @Override
    public void ejectMoney(VMachine vending_Machine) {
        System.out.println("No Money to return.");
    }

    @Override
    public void dispenseItem(VMachine vending_Machine) {
        System.out.println("Out of stock. Insert a Dollar.");
    }
}