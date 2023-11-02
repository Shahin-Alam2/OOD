public class HasDollarState implements VMachineState {
    @Override
    public void insertDollar(VMachine vending_Machine) {
        System.out.println("Already inserted a Dollar !");
    }

    @Override
    public void ejectMoney(VMachine vending_Machine) {
        System.out.println("Money Returned.");
        vending_Machine.setState(new IdleState());
    }

    @Override
    public void dispenseItem(VMachine vending_Machine) {
        if (vending_Machine.getItemCount() > 0) {
            vending_Machine.releaseItem();
            vending_Machine.setState(new IdleState());
        } else {
            System.out.println("Insufficient Stock. Money returned.");
            vending_Machine.returnMoney();
            vending_Machine.setState(new OutOfStockState());
        }
    }
}
