class Cat extends PetManagement {
    private String owner;

    public Cat(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public void makeSound() {
        System.out.println(getName() + " meow.");
    }

    public void jump() {
        System.out.println(getName() + " loves jumping.");
    }
}