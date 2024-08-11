package generic.ex1;

// 제네릭: 범용적인
// T: 타입 매개변수
// 타입 매개변수는 대문자로 작성
// 제네릭 클래스를 만들 때 타입을 결정하지 않음
// 타입 안전성과 코드 재사용에 좋음
// 제네릭이 들어간 클래스, 인터페이스 -> 제네릭 타입

public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
