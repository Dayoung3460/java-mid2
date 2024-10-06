package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println("list.getClass() = " + list.getClass());
    // 일반 리스트를 멀티스테드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만듦
    // 일반 리스트보다 성능은 더 느림
    List<Integer> synchronizedList = Collections.synchronizedList(list);
    System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());
  }
}
