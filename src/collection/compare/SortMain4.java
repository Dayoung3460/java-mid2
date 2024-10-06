package collection.compare;

import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
  public static void main(String[] args) {

    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

    List<MyUser> list = new LinkedList<MyUser>();
    list.add(myUser1);
    list.add(myUser2);
    list.add(myUser3);

    System.out.println("기본 데이터");
    System.out.println(list);

    System.out.println("Comparable 기본 정렬");
    list.sort(null);
    // 위와 결과는 같음
    // 하지만 위에거 사용하는게 더 나음.
    // 격체 스스로 가지고 있는 정렬 메소드를 사용하는게 더 객체 지향적이기 때문
    //    Collections.sort(list);
    System.out.println(list);

    System.out.println("Id Comparator 정렬");
    list.sort(new IdComparator());
//    Collections.sort(list, new IdComparator());
    System.out.println(list);

    list.sort(new IdComparator().reversed());
    System.out.println(list);


  }


}
