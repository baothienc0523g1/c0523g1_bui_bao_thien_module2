package ss5_access_modifier.practice;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Aventador", "V12");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Panorama", "V8");
        System.out.println(Car.numberOfCar);
    }
}
