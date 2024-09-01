package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // BatchProcessor(클라이언트 코드)에서 사용하는 리스트 의존관계를 컴파일 단계에서 미리 결정하는 것이 아니라
        // 런타임에서 객체를 생성하는 시점으로 미룸.
        // (컴파일 시점: 코드 자체 / 런타임 시점: 객체를 생성하고 프로그램을 실행)
        // so, MyList의 구현체(MyArrayList or MyLinkedList)를 변경해도
        // BatchProcessor의 코드는 변경되지 않음.
        // 재사용성 높아짐.

        // 생성자를 통해 런타임 의존관계를 주입하는 것을 생성자 의존관계 주입(= 생성자 주입)이라 함.
        // => 전략 패턴. (Strategy Pattern)
        BatchProcessor process = new BatchProcessor(list);

        process.logic(50_000);

    }
}

// * 재사용성을 높이려면 결정을 나중으로 미뤄야 함. 유연성 ⬆ *
// 메서드 파라미터: 메서드에서 사용할 데이터를 니중으로 미룸.
// 제네릭: 사용할 타입을 나중으로 미룸.
// 의존성 주입: 사용할 객체를 나중으로 미룸.
