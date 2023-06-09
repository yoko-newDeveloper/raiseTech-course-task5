package prpet;

public class MainDogBreed {
    public static void main(String[] args) {
        Pet firstPet = new Pet("ALBA", "chihuahua", 16);
        Pet secondPet = new Pet("VANILLA", "chihuahua", 5);
        Pet thirdPet = new Pet("LEMON", "shiba", 1);
        firstPet.displayProfile();
        secondPet.displayProfile();
        thirdPet.displayProfile();
    }
}
