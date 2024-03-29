package Bai_07_abstract_class_and_inhterface.exercise.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(String color ,boolean filler,double radius){
        super(color, filler);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return " Circle { "
                + " radius = "
                + radius
                + ", which is subclass of "
                + super.toString()
                +" } ";
    }

    @Override
    public void resize(double percent) {
        this.radius= this.radius *((percent + 100 )/ 100);
    }
}
