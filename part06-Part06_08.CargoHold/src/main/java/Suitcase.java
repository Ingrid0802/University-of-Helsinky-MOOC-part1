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
public class Suitcase {
    
    private ArrayList<Item>items;
    private int maximWeight;

    public Suitcase(int maximWeight){
        this.maximWeight = maximWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        int suitcaseWeight = 0;
        for(Item item1 : items){
            suitcaseWeight += item1.getWeight();
        }
        if(this.maximWeight - suitcaseWeight >= item.getWeight()){
            items.add(item);
        }
   
    }

    public String toString(){
        int suitcaseWeight = 0;
        String st = "";
        if(items.size() == 0){
            return "no items " + "(0 kg)";
        }
        for(Item item: items){
                suitcaseWeight += item.getWeight();
                if(items.size() == 1){
                    return "1 item (" + suitcaseWeight + " kg)";
                }
            st = items.size() + " items " + "(" + suitcaseWeight + " kg)";
        }
        return st;
    }

    public void printItems(){
        for(Item item: items){
            System.out.println(item.toString());
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Item item: items){
                totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviestItem = items.get(0);
        for(Item item: items){
            if(heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
