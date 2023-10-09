public abstract class Room implements IStructure {
    public String name;

    public Room(String name) {
        this.name = name;
    }

    public void enter() {
        System.out.println("You have entered the " +
                this.getName());
    }

    public void exit() {
        System.out.println("You have left the " +
                this.getName());
    }

    public void location() {
        System.out.println("You are currently in the" +
                this.getName());
    }

    public String getName() {
        return this.name;
    }
}