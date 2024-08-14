package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("dog1", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        // 컴파일 에러. 타입의 최대 부모는 Animal
//        WildcardEx.printWildcardV2(objBox);
        Dog dog = WildcardEx.printAndReturn(dogBox);

        catBox.set(new Cat("cat1", 200));
        Cat cat = WildcardEx.printAndReturn(catBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

        // return type이 Animal이기 때문에 Dog으로 받으려면 다운캐스팅 해줘야함\
        // 이런 경우엔 와일드카드 말고 제네릭 사용하는게 나음
        Dog dog2 = (Dog) WildcardEx.printAndReturnWildcard(dogBox);
        System.out.println("animal = " + animal);
    }
}
