package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
  public static void main(String[] args) {
    // 불변 객체 만들었는데
    List<Integer> list = List.of(1, 2, 3);
    // 가변으로 바꾸고 싶어 -->
    ArrayList<Integer> mutableList = new ArrayList<>(list);
    mutableList.add(4);
    System.out.println("mutableList = " + mutableList);
    System.out.println("mutableList.getClass() = " + mutableList.getClass());

    // 가변을 다시 불변으로 바꾸고 싶어 -->
    List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
    System.out.println("unmodifiableList = " + unmodifiableList);
    System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());

    // 값 변경 불가
//    unmodifiableList.add(5);
  }
}
