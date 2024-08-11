package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("Hello!");
        String value = (String) stringBox.getValue();
        System.out.println("value = " + value);

        // error: class java.lang.String cannot be cast to class java.lang.Integer
        integerBox.setValue("Hello!");
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);

    }
}
