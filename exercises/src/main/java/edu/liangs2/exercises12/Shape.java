package edu.liangs2.exercises12;


import edu.liangs2.exercises09.Matrix;

public class Shape {

    private boolean filled;

    private Matrix center = Matrix.mainPointID(0,0,0);

    public Shape(){

    }

    public Shape(boolean filled){
        this(Matrix.mainPointID(0,0,0),filled);
    }

    public Shape(Matrix center){
        this(center, false);
    }

    public Shape(Matrix center,boolean filled){
        setFilled(filled);
        setCenter(center);
    }

    public String toString(){
        return "Shape (center= " + center.toPoint3DString();
    }

    public Matrix getCenter(){
        return new Matrix(1,1);
    }

    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;

    }

    public void setCenter(Matrix center){
        this.center = center;
    }

}
