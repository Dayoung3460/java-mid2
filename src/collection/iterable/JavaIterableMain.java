package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Collection interface 부모가 Iterable 인터페이스임
// 모든 컬렉션 프레임워크 자료구조들은 Iterable 구현하고 있음
// Map은 컬렉션이 아니라서 바로 순회할순 없고
// keySet(), values(), entrySet()으로 키만, 값만 또는 엔트리만 뽑아서 돌릴 수 있음.
// 이 메소드들의 반환 타입은 Set이니까
public class JavaIterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list.iterator());
        foreach(list);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(set.iterator());
        foreach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator: " + iterator.getClass());
        // class java.util.ArrayList$Itr -> ArrayList 내부 클래스로 iterator를 구현하고 있음
//        class java.util.HashMap$KeyIterator -> HashSet은 HashMap의 keySet()만 가져와서 iterator 구현. 복잡,,
        // 각각의 자료구조별로 그들만의 iterator를 반환한다! 범용성 극대화!
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // foreach 사용하려면 루프돌릴 list나 set 타입의 값을 받아와야함
    // 매개변수로 두 타입을 동시에 받으려면 상위 타입인 Iterable<Integer> type으로 받으면 됨

    // Collection도 list와 set의 상위 타입인데 Collection으로 받으면 안됨?
    // -> Iterable은 iterator()만 가지고 있음. 순회 목적으로만 쓰는거면 Iterable로도 충분
    // Collection 안에는 add(), remove(), size(), contains(), isEmpty(), toArray() 메소드들이 있음
    // 이런 작업들이 필요하면 Collection 타입으로 받으면 됨
    // 목적이 순회만 하는것을 확실하게 하고 싶으면 Iterable 써!
    private static void foreach(Iterable<Integer> interable) {
        System.out.println("interable: " + interable.getClass());
        for (Integer i : interable) {
            System.out.println(i);
        }
    }
}
