package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    // <T> T: 이 메서드는 제네릭 메서드이고 T 타입을 반환한다.
    // 해당 메서드에 한정되는 제네릭
    public static <T> T genericMethod(T obj) {
        System.out.println("obj = " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }
}
