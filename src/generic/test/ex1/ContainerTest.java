package generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("stringContainer = " + stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println("stringContainer.getItem() = " + stringContainer.getItem());
        System.out.println("stringContainer.isEmpty() = " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("integerContainer.getItem = " + integerContainer.getItem());

    }
}
