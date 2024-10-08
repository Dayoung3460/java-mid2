package collection.iterable;

import java.util.Iterator;

// ArrayList나 LinkedList나 HashMap 이런 데이터가 나열된 자료구조를 순회하는 방식은 다 다름
// 불편,,, 통일된 방법으로 순회할순 없을까?
// Iterable, Iterator 탄생

// Iterable 인터페이스: iterator 메소드 가지고 있음
// Iterable 구현 클래스: iterator 메소드 오버라이딩해서 Iterator 인터페이스 반환
// Iterator 인터페이스: hasNext() next()
// Iterator 구현 클래스: hasNext() next() 메소드 두 개 오버라이딩

// 자바 자료구조들은 Iterable 오버라이딩하고 있음. 자료구조마다 순회하는 로직은 자바가 다 짜놨음
// 우리는 iterator() 메소드 갖다 쓰기만 하면 됨
// 여기서는 배열 순회 방식만 직접 구현해본거


public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        System.out.println("advanced for-each");

        // advanced for-each 사용하려면 array이거나 java.lang.Iterable 구현체여야함
        // 컴파일 시점에 advanced for-each 구문을 자바가 iterator 구문으로 코드를 변경함
        // 사실상 위와 같은 코드임
        // for문 사용하는게 더 깰끔-
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
