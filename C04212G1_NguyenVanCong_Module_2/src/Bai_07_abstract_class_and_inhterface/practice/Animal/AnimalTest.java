package Bai_07_abstract_class_and_inhterface.practice.Animal;


import Bai_07_abstract_class_and_inhterface.practice.Animal.Animal;
import Bai_07_abstract_class_and_inhterface.practice.Animal.Chicken;
import Bai_07_abstract_class_and_inhterface.practice.Animal.Edible;
import Bai_07_abstract_class_and_inhterface.practice.Animal.Tiger;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }

        }
    }
}
