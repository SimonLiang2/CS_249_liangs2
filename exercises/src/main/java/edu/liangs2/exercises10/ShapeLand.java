package edu.liangs2.exercises10;

import edu.liangs2.exercises09.Matrix;

public class ShapeLand {
    public static void main(String [] args){
        Circle c1= new Circle();
        c1.setRadius(5);
        Matrix T = Matrix.makeTranslation3D(5.0, -2.0, 0.0);

        //Matrix center = c1.getCenter();
        //center.set(0,0,5.0);
        System.out.println(c1);
    }
}
