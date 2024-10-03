package collection.set.test;

import java.util.HashSet;

public class RectangleTest {
    public static void main(String[] args) {
        HashSet<Rectangle> rectangleSet = new HashSet<Rectangle>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20));

        for (Rectangle rectangle : rectangleSet) {
            System.out.println("rectangle = " + rectangle);
        }
    }
}

// 자바의 최적화 여기까지 되어있다!
// 해쉬코드로 해쉬인덱스 구해서 같은 해쉬인덱스 가진 데이들을 LinkedList에 넣음
// 값이 계속 추가 되다가 LinkedList 하나에 8개 이상(김영한 센세도 정확한 숫자는 기억안난다함)의 데이터가 쌓이면
// TreeSet으로 타입을 바꿈.
// ex) LinkedList에 데이터 8개가 들어있으면 최악의 경우에 8번을 돌아야함
// ex) TreeSet으로 바꾸면
// 8 / 2 -> 4
// 4 / 2 -> 2
// 2 / 2 -> 1
// 최악의 경우에도 3번만에 찾을 수 있음
// o(log n)이라 데이터가 많을수록 LinkedList보다 성능이 좋아짐

// 리해싱
// 해쉬셋의 capacity에서 75%(평군적으로)정도 차면 자바가 capacity를 두배로 늘림.
// 리해싱을 함. 다시 해쉬인덱스 다 계산에서 값을 넣음. capacity가 달라졌으니 다시 해야지