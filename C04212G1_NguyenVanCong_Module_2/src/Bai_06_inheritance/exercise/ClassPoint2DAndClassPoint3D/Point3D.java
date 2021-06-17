package Bai_06_inheritance.exercise.ClassPoint2DAndClassPoint3D;

import Bai_06_inheritance.exercise.ClassPoint2DAndClassPoint3D.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D { "
                +" X = "
                +getX()
                +" Y = "
                +getY()
                +" Z = "
                +z
                +" } ";
    }
}
