package edu.liangs2.exercises03;

public class Supplies {

    private double totalFood =0.0;

    public double getTotalFood()
    {
        return totalFood;
    }



    public boolean setTotalFood(double food){
        boolean valid = false;
        if(food >=0){
            totalFood = food;
            valid = true;
        }
        return valid;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("*********** SUPPLIES ***********\n");
        sb.append("\t*Food:\n");
        return "";
    }


}

