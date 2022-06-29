package Project1;

public class Waiter implements WaiterInterface {
    @Override
    public void seatsCust() {
        System.out.println("Waiter seated customer");        
    }
    @Override
    public void takesOrder() {
        System.out.println("Waiter takes customer's order");
    }
    @Override
    public void bringsOrder() {
        System.out.println("Waiter brings order to chef");
    }
    @Override
    public void bringsFood() {
        System.out.println("Waiter brings food to the customer");        
    }
}
