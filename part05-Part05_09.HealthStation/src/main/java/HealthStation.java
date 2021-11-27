
public class HealthStation {


    private int count = 0;

    public int weigh(Person person){
        count++;
        return person.getWeight();

    }

    public void feed(Person person){
        int weightPerson = person.getWeight();
        weightPerson++;
        person.setWeight(weightPerson);

    }

    public int weighings(){
        return count;
    }
    

}
