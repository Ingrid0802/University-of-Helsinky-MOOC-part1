
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
 public String toString(){
        String st = "The collection " + this.name;
        String elementsAsString = "";
        if(elements.isEmpty()){
            return st + " is empty.";
        }else if(this.elements.size() == 1){
            return st + " has " + elements.size() + " element:\n" + this.elements.get(0);
        }
        for(String element: elements){
           elementsAsString = elementsAsString + element + "\n";
        }
        return st + " has " + this.elements.size() + " elements:\n" + elementsAsString;
    }
    
}
