package edu.liangs2.exercises10;

public class Circle {
    double radius = 0.0;

    public Circle(){

    }
    public Circle(double r){
        radius = r;
    }





    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        if(r>=0){
            radius = r;
        }
    }
}
