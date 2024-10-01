package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        // hashCode는 같음
        // set안에 같은 hashIndex 안에 들어있음
        System.out.println("m1 = " + m1.hashCode());
        System.out.println("m2 = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 오버라이딩된 해쉬코드가 아니고 기존의(참조값을 기반으로 한) 해쉬코드
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        // add를 할 때 중복값 체크함. 이미 contain 되어 있으면 add 시키면 안됨
        // 하지만 contains도 equals를 사용하는데 equals(참조값 체크)로 중복체크하면
        // 서로 다른 값으로 보기 때문에 중복으로 값이 들어가버림
        set.add(m1);
        set.add(m2);

        System.out.println(set);
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue = " + searchValue.hashCode());

        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
