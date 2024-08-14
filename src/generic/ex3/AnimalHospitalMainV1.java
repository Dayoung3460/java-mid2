package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 매개면수 체크 실패: Animal 타입은 Dog, Cat의 상위 타입이기 때문에
        dogHospital.set(cat);
        dogHospital.set(dog);
        // Dog 타입으로 다운캐스팅 해줘야함
        // Cat 타입을 입력했는데 Dog를 반환하는 경우도 생김 - 캐스팅 예외 발생
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
