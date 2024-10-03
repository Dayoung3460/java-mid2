package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

//        new LinkedHashSet<>(): 생성자에 컬렉션 타입이 올 수 있음 > List가 올 수 있음
        // 배열이 생성자에 올 순 없음
        // List.of(): 파라미터로 배열을 넣어주면 리스트로 반환해줌
        // new LinkedHashSet<>(List.of(inputArr)): LinkedHashSet객체를 만드는 동시에 값을 넣음
        // List.of(배열), Arrays.asList(배열) 같은 기능
        // Arrays.asList() 메서드는 자바 1.2부터 존재했음
        // 자바 9이상 사용하면 List.of() 권장
//        LinkedHashSet<Integer> integers = new LinkedHashSet<>(Arrays.asList(inputArr));
        LinkedHashSet<Integer> integers = new LinkedHashSet<>(List.of(inputArr));

        System.out.println(integers);
    }
}
