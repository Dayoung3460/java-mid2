package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(cat);

        Dog bigDog = new Dog("big dog", 200);
        Dog bigger = AnimalMethod.bigger(dog, bigDog);
        System.out.println(bigger);
    }
}


