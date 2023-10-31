package edu.liangs2.exercises12;
import edu.liangs2.exercises09.Matrix;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius, Matrix center, boolean filled){
        this.radius = radius;
        setCenter(center);
        setFilled(filled);

    }

    public String toString(){
        return "Circle (radius:" + radius +", center:" + getCenter().toPoint3DString() + ", filled:" + isFilled() + ")";
    }
}
