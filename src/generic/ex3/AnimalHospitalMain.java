package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

//        dogHospital.set(cat);
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
