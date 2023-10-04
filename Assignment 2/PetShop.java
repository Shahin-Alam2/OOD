class PetShop {
    private String name;

    public PetShop(String name) {
        this.name = name;
    }

    public void sellPet(PetManagement pet) {
        System.out.println(name + " sells " + pet.getName() + " which age is " + pet.getAge());
    }
}