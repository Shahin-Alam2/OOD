
class Fish extends PetManagement {
    private String owner;

    public Fish(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public void makeSound() {
        System.out.println(getName() + " no sound.");
    }

    public void swim() {
        System.out.println(getName() + " loves swimming.");
    }
}