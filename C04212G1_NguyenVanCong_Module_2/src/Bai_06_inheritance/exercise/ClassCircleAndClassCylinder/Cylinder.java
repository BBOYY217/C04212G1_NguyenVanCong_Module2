package Bai_06_inheritance.exercise.ClassCircleAndClassCylinder;

import Bai_06_inheritance.exercise.ClassCircleAndClassCylinder.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume (){
        return getArea() * height;
    }

    @Override
    public String toString(){
        return " Cylinder { "
                + " height "
                + height
                + " } ";
    }
}
