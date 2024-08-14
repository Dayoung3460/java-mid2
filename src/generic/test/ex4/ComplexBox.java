package generic.test.ex4;

import generic.animal.Animal;

// 제네릭 타입(클래스 제네릭 타입)과 제네릭 메서드의 우선순위
// 제네릭 메서드의 우선순위가 높음
public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

//    public <Z> Z printAndReturn(Z z) {
//        System.out.println("animal.className: " + animal.getClass().getName());
//        System.out.println("t.className: " + z.getClass().getName());
//        return z;
//    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        // 여기서의 t는 메서드 인자의 t임.
        // animal 상속받은 T 타입이 아님.
        // 이렇게 같은 타입으로 짓는건 좋은 방법이 아니지~
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }

}
