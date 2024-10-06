package collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMain {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // Collections class 다양한 유틸 함수 제공(Collection 인터페이스랑 헷갈리지마셈)
    Integer max = Collections.max(list);
    Integer min = Collections.min(list);

    System.out.println("max = " + max);
    System.out.println("min = " + min);

    System.out.println("list = " + list);
    Collections.shuffle(list);
    System.out.println("shuffle list = " + list);
    list.sort(null);
//    Collections.sort(list);
    System.out.println("sort list = " + list);
    Collections.reverse(list);
    System.out.println("reverse list = " + list);
  }
}
