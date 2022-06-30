package Project1;

public class Waiter implements WaiterInterface {
    @Override
    public void seatsCust() {
        System.out.println("Yellen seated customer");        
    }
    @Override
    public void takesOrder() {
        System.out.println("Yellen takes customer's order");
    }
    @Override
    public void bringsOrder() {
        System.out.println("Yellen brings order to chef");
    }
    @Override
    public void bringsFood() {
        System.out.println("Yellen brings food to the customer");        
    }
}
