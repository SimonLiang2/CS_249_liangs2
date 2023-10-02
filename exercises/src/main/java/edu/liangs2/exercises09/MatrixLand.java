package edu.liangs2.exercises09;
import edu.liangs2.exercises09.Matrix;

public class MatrixLand {
    //main function
    public static void main(String [] args){
        Matrix p = Matrix.mainPointID(5,3,-2);
        System.out.println(p);
        Matrix t = Matrix.makeTranslation3D(2,8,0);
        System.out.println(t);
        Matrix p2 = t.multiply(p);
        System.out.println(p2);
    }
}
