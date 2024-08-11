package generic.ex1;

// 제네릭: 타입 메개변수.
// 제네릭 클래스를 만들 때 타입을 결정하지 않음
// 타입 안전성과 코드 재사용에 좋음

public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
