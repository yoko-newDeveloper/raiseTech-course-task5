package prpet;

public class Pet {
    private String name;
    private String dogBreed;
    private int age;

    public Pet(String name, String dogBreed, int age) {
        this.name = name;
        this.dogBreed = dogBreed;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDogBreed(String dogBreed) {
        return dogBreed;
    }
    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
    public int getAge(int age) {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void displayProfile() {
        System.out.println("---------------");
        System.out.println("愛犬のプロフィール");
        System.out.println("---------------");
        System.out.println("愛犬の名前：" + name);
        System.out.println("愛犬の犬種 :" + dogBreed);
        System.out.println("愛犬の年齢：" + age + "歳");
        System.out.println("\n");
    }
}
