package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        // 컴파일 오류. 제네릭 타입을 extends Animal 로 제한했기 때문에 Integer 타입은 사용할 수 없음
//        AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

//        dogHospital.set(cat);
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
