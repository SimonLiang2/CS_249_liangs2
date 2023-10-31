package edu.liangs2.exercises12;

import edu.liangs2.exercises09.Matrix;

public class SuperShapeLand {
    public static void main(String [] args){

        Shape s1 = new Shape();
        Shape s2 = new Shape (Matrix.mainPointID(1,1,1),true);

        System.out.println(s1);

        System.out.println(s2);

        Circle c2 = new Circle (7.0,Matrix.mainPointID(4,5,6),true);
        Circle c1 = new Circle();
        
    }
}
