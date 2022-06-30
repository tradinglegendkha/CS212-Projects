package Project1;

public class WaiterTwo implements WaiterInterface {
    @Override
    public void seatsCust() {
        System.out.println("Rebecca seated customer");        
    }
    @Override
    public void takesOrder() {
        System.out.println("Rebecca takes customer's order");
    }
    @Override
    public void bringsOrder() {
        System.out.println("Rebecca brings order to chef");
    }
    @Override
    public void bringsFood() {
        System.out.println("Rebecca brings food to the customer");        
    }
}
