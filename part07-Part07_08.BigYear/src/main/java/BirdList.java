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

public class BirdList {
    
    private ArrayList<Bird> birds;

    public BirdList(){
        this.birds = new ArrayList<>();
    }

    public void add(String name, String latinName){
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }

    public void addObservation(String name){
        for(Bird bird : birds){
            if(bird.getName().equalsIgnoreCase(name) || bird.getLatinName().equalsIgnoreCase(name)){
                bird.countObservations();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printOneBird(String name){
        for(Bird bird : birds){
            if(bird.getName().equalsIgnoreCase(name) || bird.getLatinName().equalsIgnoreCase(name)){
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll(){
        for(Bird bird : birds){
            System.out.println(bird.toString());
        }
    }
}
