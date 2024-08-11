package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        // 제네릭 타입을 생성할 때 타입을 지정해주지 않으면 Object 타입으로 처리
        // Row type(제네릭 타입인데 타입 지정 안한 경우)을 지원해주는 이유: 하위 호완 때문에
        // 명시적으로 타입 지정해주는게 좋음
        GenericBox integerGenericBox = new GenericBox();
    }
}
