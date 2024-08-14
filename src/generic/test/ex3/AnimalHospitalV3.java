package generic.test.ex3;

import generic.animal.Animal;

// T는 Animal 또는 Animal의 하위 타입만 가능
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // animal의 타입은 <T extends Animal>이므로 getName(), getSize() 호출 가능
        System.out.println("animal name: " + animal.getName());
        System.out.println("animal size: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
