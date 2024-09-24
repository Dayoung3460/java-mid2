package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 객체의 참조값으로 해쉬코드 생성
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        // 객체만 출력하면 참조값이 16진수로 변환돼서 반환되기 때문에 위의 해쉬코드와 결과값은 다름
        System.out.println("obj1 = " + obj1);

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        // Integer나 String 같은 자바의 기본 클래스들은 대부분 내부 값을 기반으로 해쉬코드 구할 수 있도록
        // 해쉬코드 메서드 재정의 해뒀음
        System.out.println(i.hashCode());
        System.out.println(strA.hashCode());
        System.out.println(strAB.hashCode()); // 문자 조합일 때는 최대한 중복되지 않게 큰 수가 나옴

        // 해쉬코드에 마이너스가 들어올 수도ㅇㅇ
        System.out.println(Integer.valueOf(-1).hashCode());

        Member id1 = new Member("idA");
        Member id2 = new Member("idA");

        // 다른 인스턴스기 때문에 false
        System.out.println(id1 == id2);
        // 안에 내용은 같으니까(id 기준) true
        System.out.println(id1.equals(id2));

        // hashCode 같음.
        // id 기준으로 해쉬코드를 오버라이딩 해놨기 때문에 id가 같으면 해쉬코드 같음
        // 만약 오버라이딩 안해놨으면 객체 참조값 기준으로 해쉬코드 생성하기 때문에 해쉬코드 다름
        // 같은 데이터를 가지고 있는 객체가 해쉬코드가 다르면 안됨. 오버라이딩 해주는거 중요
        System.out.println(id1.hashCode());
        System.out.println(id2.hashCode());
    }
}
