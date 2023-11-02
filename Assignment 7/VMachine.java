public class VMachine {

    private VMachineState currentState;
    private int itemCount;

    public VMachine(int itemCount) {
        this.itemCount = itemCount;
        if (itemCount > 0) {
            currentState = new IdleState();
        } else {
            currentState = new OutOfStockState();
        }
    }

    // current state
    public void setState(VMachineState state) {
        currentState = state;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void releaseItem() {
        System.out.println("Item dispensed. Enjoy your snacks!");
        itemCount--;
    }

    public void returnMoney() {
        System.out.println("Money returned./n Thank you!");
    }
}
