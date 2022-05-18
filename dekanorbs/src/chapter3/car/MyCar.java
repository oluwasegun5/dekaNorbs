package chapter3.car;

public class MyCar {
    public static void main(String[] args) {
        Car toyota = new Car("Corola","2020",200.0);
        Car honda = new Car("Evil spirit","2019",190.0);

        System.out.println(toyota.price());
        System.out.println(honda.price());
    }


}
