package lesson12abs;

public class MainPetRuner {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.voice();
        pet.move();
        Pet pet2 = new Cat();
        pet2.voice();
        pet2.move();
        Dog pet3 = new Dog();
        ((Dog)pet).dogBark();
    }
}
