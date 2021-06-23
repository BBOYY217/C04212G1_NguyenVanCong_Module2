package Bai_07_abstract_class_and_inhterface.exercise.Resizeable;

public class Test {
        public static void main(String[] args) {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle(3.5);
            shapes[1] = new Rectangle(6.0,8.0);
            shapes[2] = new Square(7);
            System.out.println(" khi chưa tăng kích thước ");
            for (Shape element: shapes) {
                System.out.println(element);
            }

            ((Circle)shapes[0]).resize(Math.random()*100);
            System.out.println("new value 0 "+shapes[0]);
            System.out.println("Diện tích sau khi tăng "+((Circle)shapes[0]).getArea());
            ((Rectangle)shapes[1]).resize(Math.random()*100);
            System.out.println("new value 1 " +shapes[1]);
            System.out.println("Diện tích Hình chữ nhật sau khi tăng "+((Rectangle)shapes[1]).getArea());
            ((Square)shapes[2]).resize(Math.random()*100);
            System.out.println("new value 2 ");
            System.out.println("Diện tích hinh vuông sau khi tăng "+((Square)shapes[2]).getArea());

        }
    }

