package edu.liangs2.exercises03;

public class Party {

    private Person [] people;
    public Party(String [] names){
        int cnt = names.length;
        people = new Person[cnt];
        for (int i =0; i< cnt; i++){
            people [i]= new Person(names[i]);
        }
    }
}
