package generic.test.ex5;

import generic.animal.Animal;

// 와일드카드는 클래스 제네릭 타입이나 제네릭 메서드를 선언하는 것이 아님.
// 그냥 일반 메서드. 매개변수로 제네릭 타입을 받을 수 있는 것일 뿐
// 이미 만들어진 제네릭 타입을 활용하는 것임
// 와일드 카드를 사용할 수 있으면 제네릭 타입을 사용하기 보다 와일드 카드를 사용하는 것을 권장.
public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // ?에 모든 타입이 들어올 수 있음
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("name = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("name = " + animal.getName());
    }

    static <T extends Animal> T printAndReturn(Box<T> box) {
        T t = box.get();
        System.out.println("name = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("name = " + animal.getName());
        return animal;
    }
}
