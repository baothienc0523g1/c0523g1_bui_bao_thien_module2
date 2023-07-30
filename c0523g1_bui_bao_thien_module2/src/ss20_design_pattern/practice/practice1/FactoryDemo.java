package ss20_design_pattern.practice.practice1;

import ss20_design_pattern.practice.practice1.Animal;
import ss20_design_pattern.practice.practice1.AnimalFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("Feline");
        System.out.println("animal1 sound: " + animal1.makeSound());

        Animal animal2 = animalFactory.getAnimal("Canine");
        System.out.println("animal2 sound: " + animal2.makeSound());
    }
}
