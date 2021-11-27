
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        
        
        PaymentCard card = new PaymentCard(20);
        //System.out.println("Paul: " + card);
        //System.out.println("Paul: " + card);

        PaymentCard card2 = new PaymentCard(30);
        //System.out.println("Matt: " + card2);
        //System.out.println("Matt: " + card2);

        card.eatHeartily();
        card2.eatAffordably();
        System.out.println("Paul: " + card);
        System.out.println("Matt: " + card2);

        card.addMoney(20);
        card2.eatHeartily();
        System.out.println("Paul: " + card);
        System.out.println("Matt: " + card2);

        card.eatAffordably();
        card.eatAffordably();

        card2.addMoney(50);
        System.out.println("Paul: " + card);
        System.out.println("Matt: " + card2);


    }
}
