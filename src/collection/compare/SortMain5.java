package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
  public static void main(String[] args) {
    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

    TreeSet<MyUser> treeSet1 = new TreeSet<>();
    // treeSet이나 TreeMap은 값이 들어갈 때마다 정렬이 돼서 들어가야 함.
    // 객체가 구현한 Comparable 기준으로
    treeSet1.add(myUser1);
    treeSet1.add(myUser2);
    treeSet1.add(myUser3);
    System.out.println("Comparable 기본 정렬");
    System.out.println(treeSet1);

    // TreeSet 객체 생성할 때 생성자 파라미터로 비교자 넣어주면
    // 해당 비교자 기준으로 값이 들어감
    TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
    treeSet2.add(myUser1);
    treeSet2.add(myUser2);
    treeSet2.add(myUser3);
    System.out.println("IdComparator 정렬");
    System.out.println(treeSet2);

  }
}
