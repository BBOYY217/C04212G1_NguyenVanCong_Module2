package Bai_06_inheritance.exercise.ClassPointAndMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }
        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x , y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return " MovablePoint { "
                + " xSpeed = "
                + xSpeed
                + " ySpeed = "
                + ySpeed
                + " } ";
    }

    public MovablePoint move(){
        this.setxSpeed(super.getX()+getxSpeed());
        this.setySpeed(super.getY()+getySpeed());
        return this;
    }
}
