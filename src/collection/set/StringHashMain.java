package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        System.out.println();
        System.out.println("hashCode = " + hashCode("A"));
        System.out.println("hashCode = " + hashCode("B"));
        System.out.println("hashCode = " + hashCode("AB"));

        System.out.println(hashIndex(hashCode("A")));
        System.out.println(hashIndex(hashCode("B")));
        System.out.println(hashIndex(hashCode("AB")));
    }

    // hashIndex 만들기 위해 문자를 숫자로 변환해서 hashCode를 구함
    // 해시함수: 해시값(해시코드) 출력하는 함수
    // 해시코드: 데이터를 대표하는 값
    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    // 해시 인덱스: 데이터의 저장 위치를 결정. 해시 코드를 사용해서 만듦
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

// 어떤 객체든지 정수로 만든 해시코드만 있으면 해시 인덱스를 사용할 수 있음
