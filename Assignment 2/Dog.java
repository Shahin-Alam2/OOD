public class Dog extends PetManagement {
    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public void makeSound() {
        System.out.println(getName() + " bark.");
    }

    public void fetch() {
        System.out.println(getName() + " loves fetching a thrown object.");
    }
}