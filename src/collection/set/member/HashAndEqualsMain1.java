package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        // 기본 Object가 제공하는 hashCode는 객체 참조값을 기준으로 하기 때문에 두 객체 해쉬코드 다름
        // 기본 Object가 제공하는 equals()도 '==' 비교임. 참조값 비교
        System.out.println("m1 = " + m1.hashCode());
        System.out.println("m2 = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 논리적으로 같은 객체 두개가 중복으로 set에 들어가 있음 -> 망한거임
        set.add(m1);
        set.add(m2);

        System.out.println(set);

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue = " + searchValue.hashCode());

        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
