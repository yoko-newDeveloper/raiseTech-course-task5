package prpet;

public class MainDogBreed {
    public static void main(String[] args) {
        Pet firstPet = new Pet("ALBA", "chihuahua", 16);
        Pet secondPet = new Pet("VANILLA", "chihuahua", 5);
        firstPet.displayProfile();
        secondPet.displayProfile();
    }
}
