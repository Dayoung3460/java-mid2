package collection.link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("== add data ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("== functions == ");
        System.out.println("list.size(): " + list.size()); // [a, b, c, null, null]]
        System.out.println("list.get(1): " + list.get(1)); // b
        System.out.println("list.indexOf('c'): " + list.indexOf("c")); // 2
        System.out.println("list.set(2, 'z'): " + list.set(2, "z")); // [a, b, z, null, null] 2 반환
        System.out.println(list); // [a, b, z]

        System.out.println("over the capacity");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
    }
}
