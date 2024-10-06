package collection.compare;

import java.util.Arrays;

// 객체를 소팅할 때
public class SortMain3 {
  public static void main(String[] args) {
    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

    MyUser[] array = {myUser1, myUser2, myUser3};
    System.out.println("기본 데이터");
    System.out.println(Arrays.toString(array));

    System.out.println("comparable 기본 정렬");
//     sort() 메소드에 배열 값만 넣으면(첫번째 인수만 넣으면) 배열 Comparable 구현하고 있어야함
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));

    System.out.println("IdComparator 정렬");
    // sort()의 두번째 파라미터로 비교자를 넣어주면 해당 비교자를 기준으로 소팅.
    // MyUser에서 따로 Comparable 구현안해도 됨.
    Arrays.sort(array, new IdComparator());
    System.out.println(Arrays.toString(array));

    Arrays.sort(array, new IdComparator().reversed());
    System.out.println(Arrays.toString(array));
  }
}
