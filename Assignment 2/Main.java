
public class Main {
    public static void main(String[] args) {
        PetManagement dog = new Dog("Bull", 3, "AA");
        PetManagement cat = new Cat("Tom", 2, "BB");
        PetManagement fish = new Fish("Catla", 1, "CC");

        dog.eat();
        cat.eat();
        fish.eat();

        PetShop petShop = new PetShop("Pet Shop 2");
        PetCare petCare = new PetCare();

        petShop.sellPet(dog);
        petShop.sellPet(cat);
        petShop.sellPet(fish);

        petCare.takeCare(dog);
        petCare.takeCare(cat);
        petCare.takeCare(fish);
    }
}
