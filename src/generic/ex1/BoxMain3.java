package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        // 객체 생성 시점에 타입 T의 타입 결정
        // 기본형 타입은 안됨. ex) int, double, float, char
        // 타입 인자: Integer
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
//        integerBox("100"); // 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입으로 반환
        System.out.println("integer = " + integer);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("Hello!");
        String value = stringGenericBox.get();
        System.out.println("value = " + value);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(10.5);
        Double doubleValue = doubleGenericBox.get();
        System.out.println("doubleValue = " + doubleValue);



    }
}
