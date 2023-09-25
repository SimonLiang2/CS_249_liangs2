package edu.liangs2.exercises06;
import java.util.Scanner;
import edu.liangs2.exercises03.Supplies;



public class GeneralStore {


    public void printWelcome(){
        //TODO
    }
    public void printSelection(){
        //TODO
    }

    public String askForSelection(){

        //WIP
        Scanner input = new Scanner(System.in);
        System.out.println("Enter selection (cnt item)");
        String request = input.nextLine();
        return request;
    }

    public int getCount(String s){
        //WIP
        String c = s.split("")[0];
        int cnt = Integer.parseInt(c);

        return cnt;
    }
    public String getItem(String s){
        //WIP
        String item = s.split("")[0];
        return item;
    }

    public boolean isInStock(String item){
        item = item.toLowerCase();

        return (item.equals("food"));
    }

    public void processSupplies(Supplies supplies,int cnt, String item){
        double current = 0;
        if(item.equals("food")){
            current = supplies.getTotalFood();
        }
        current += cnt;

        if(current <= 0){
            System.out.println("You dont have enough "+ item + "!\n");
        }
        else{
            if (item.equals("food")){
                supplies.setTotalFood(current);
            }
        }

    }

    public void enterStore(Supplies supplies, Scanner input){
        printWelcome();
        int cnt =0;
        boolean knownItem = false;
        do{
            printSelection();
            String request = askForSelection();
            cnt = getCount(request);
            String item = getItem(request);
            knownItem = isInStock(item);
            if (knownItem){
                processSupplies(supplies,cnt, item);

            }



        }while (cnt !=0 && knownItem);

    }
}



