/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int count;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public int getCount(){
        return this.count;
    }

    public void countObservations(){
        count++;
    }

    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.count + " observations";
    }
}
