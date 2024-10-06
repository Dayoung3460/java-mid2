package collection.utils;

import java.util.*;

public class EmptyListMain {
  public static void main(String[] args) {
    // 빈 가변 리스트 생성
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    // 빈 불변 리스크 생성

    List<Integer> list3 = Collections.emptyList(); // java5
    List<Integer> list4 = List.of(); // java9

    System.out.println("list1 = " + list1.getClass());
    System.out.println("list2 = " + list2.getClass());
    System.out.println("list3 = " + list3.getClass());
    System.out.println("list4 = " + list4.getClass());

    // list5는 값의 길이 변경 불가하지만 데이터 변경은 가능함
    // list5.set(0, 100) 가능
    // 불변도 아니고 가변도 아니고 애매해서 사용 지양
    // 근데 진짜 진짜 어마어마한 배열을 리스트로 변경해야한다? Arrays.asList() 사용.
    // 배열의 참조값을 그대로 들고와서 사용하기 때문에 새로운 객체를 만드는 것이 아님
    // Arrays.asList()는 사실상 껍데기 역할.
    // List.of()는 새로운 객체를 생성하는 거.
    // 그래도 대부분의 경우는 List.of() 사용
    List<Integer> list5 = Arrays.asList(1, 2, 3);
    List<Integer> list6 = List.of(1, 2, 3);
    System.out.println("list5 = " + list5);
    System.out.println("list6 = " + list6);
  }
}
