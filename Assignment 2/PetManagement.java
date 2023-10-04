public class PetManagement {
    private String name;
    private int age;

    public PetManagement(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " is eating food.");
    }

}