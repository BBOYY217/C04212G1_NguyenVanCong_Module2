package Bai_05_advanced_programming_with_java.exercise;

public class CircleTest { public static void main(String[] args) {
    Circle circle1 = new Circle();
    System.out.println(circle1.getRadius());
    System.out.println(circle1.getArea());
    Circle circle2= new Circle(8);
    System.out.println(circle2.getRadius());
    System.out.println(circle2.getArea());
   }
}
