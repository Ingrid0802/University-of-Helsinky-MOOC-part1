
public class Statistics {

    private int count;
    private int sum;

    public Statistics(){
        this.count = 0;
        this.sum = 0;
        
    }

    public void addNumber(int number){
        count++;
        this.sum += number;
    }

    public int getCount(){
        return count;
    }

    public int sum(){
        return sum;
    }

    public double average(){
        if(sum == 0 || count == 0){
            return 0;
        }else{
            double average = (double) sum / count;
            return average;
        }
    }
}