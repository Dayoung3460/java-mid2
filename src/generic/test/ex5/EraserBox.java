package generic.test.ex5;

// Type Eraser
// 자바의 제네릭 타입은 컴파일 시점에만 존재하고
// .class로 자바를 실행하는 런타임에는 제네릭 정보가 지워짐
// 개발자가 직접 캐스팅 하는 코드를 컴파일러가 대신 처리해주는거.

public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
        // 런타임에서 제네릭 타입은 지워지고 T는 Object로 변환됨.
        // 항상 true를 반환하기 때문에 제네릭 타입은 instanceof 연산자 사용 불가
        //        return param instanceof T;
        return false;
    }

    public void create() {
//        new Object()가 되기 때문에 타입 매개변수에 new 연산자를 사용할 수 없음
//        return new T();
    }
}
