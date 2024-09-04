package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 myHashSetV0 = new MyHashSetV0();
        myHashSetV0.add(1); // O(1) 처음엔 빈 배열에 값을 넣는거라 contains 함수의 for문이 돌지 않음
        // 데이터 추가하는게 오래걸림. 중복 데이터 있는지 다 루프 돌면서 확인해야하기 때문에
        // => 해쉬 알고리즘으로 해결 가능ㄴㄴ
        myHashSetV0.add(2); // O(n)
        myHashSetV0.add(3); // O(n)
        myHashSetV0.add(4); // O(n)
        myHashSetV0.add(5); // O(n)
        System.out.println(myHashSetV0);

        myHashSetV0.add(4);
        System.out.println(myHashSetV0);

        System.out.println(myHashSetV0.contains(3));
        System.out.println(myHashSetV0.contains(30));


    }
}
