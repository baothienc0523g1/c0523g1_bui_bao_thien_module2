package ss20_design_pattern.practice.practice1;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("Canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
