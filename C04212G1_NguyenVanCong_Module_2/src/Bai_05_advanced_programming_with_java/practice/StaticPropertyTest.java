package Bai_05_advanced_programming_with_java.practice;

import Bai_05_advanced_programming_with_java.practice.Car;

public class StaticPropertyTest {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

    }

}
