import java.util.ArrayList;

public class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address) {
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }

    public String getName() {
        return this.address;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    public void location() {
        System.out.println("You are currently in " +
                this.getName() + ". It has ");
        for (IStructure struct : this.structures)
            System.out.println(struct.getName());
    }

    public void enter() {
        System.out.println("You have entered the " +
                this.getName());
    }

    public void exit() {
        System.out.println("You have left the " +
                this.getName());
    }
}