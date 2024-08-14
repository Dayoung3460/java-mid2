package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.genericMethod(i);

        // 타입 인자 명시적 전달.
        // 제네릭 메서드에 인자를 Integer 타입으로 지정
        // 타입을 지정하면서 메서드 호출 동시에
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println(result);
        Double doublerValue = GenericMethod.<Double>numberMethod(10.0);
        System.out.println(doublerValue);

        // static 메서드에서는 클래스의 제네릭 타입을 사용 할 수 없음
        // 클래스의 제네릭 타입은 객체가 생성될 때 타입을 지정해주는데
        // static 메서드는 객체 생성과 상관없기 때문.
        // static T staticMethod(T t) {} // 불가능

        // 자바 컴파일러가 타입 추론 가능. <Integer> 생략 가능
        Integer result1 = GenericMethod.genericMethod(2);
        System.out.println(result1);
    }
}
