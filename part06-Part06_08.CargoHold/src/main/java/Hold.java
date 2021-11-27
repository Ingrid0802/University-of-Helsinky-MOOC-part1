/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.ArrayList;

public class Hold {
    
    private int maximWeight;
    private ArrayList<Suitcase>suitcases;

    public Hold(int maximWeight){
        this.maximWeight = maximWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        int holdWeight = 0;
        for(Suitcase suitcase1 : suitcases){
            holdWeight += suitcase1.totalWeight();
        }
        if(this.maximWeight - holdWeight >= suitcase.totalWeight()) {
            suitcases.add(suitcase);
        }
        

    }

    public String toString(){
        int totalWeight = 0;

        for(Suitcase suitcase: suitcases){
                totalWeight += suitcase.totalWeight();
        }
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems(){
        for(Suitcase suitcase: suitcases){
           suitcase.printItems();
        }
    }

}
