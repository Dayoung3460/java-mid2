package generic.test.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드 정의 시점에서는 알 수 없으므로 animal의 getName(), getSize() 호출 불가
        // T와 관련된 메서드는 Object에 있는 메서드만 사용 가능
        // ex) T.toString()

//        System.out.println("animal name: " + animal.getName());
//        System.out.println("animal size: " + animal.getSize());
//        animal.sound();


    }

    public T getBigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;

        return null;
    }

}
