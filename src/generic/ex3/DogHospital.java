package generic.ex3;

import generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("animal name: " + animal.getName());
        System.out.println("animal size: " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
