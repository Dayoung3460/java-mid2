package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        numberList.add(1);
        numberList.add(2);
        numberList.add("text3");
        System.out.println(numberList);

        // Object return 하므로 다운캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // 예외 터짐
        Integer num3 = (Integer) numberList.get(2);


    }
}
