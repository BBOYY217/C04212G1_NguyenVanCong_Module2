package Bai_06_inheritance.exercise.ClassPointAndMoveablePoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(5 ,8,7,6);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
