package ss5_access_modifier.practice;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    public String getName() {
        return this.name;
    }
    public String getEngine() {
        return this.engine;
    }
}
