package Project1;

public class WaiterThree implements WaiterInterface {
    @Override
    public void seatsCust() {
        System.out.println("Bernanke seated customer");        
    }
    @Override
    public void takesOrder() {
        System.out.println("Bernanke takes customer's order");
    }
    @Override
    public void bringsOrder() {
        System.out.println("Bernanke brings order to chef");
    }
    @Override
    public void bringsFood() {
        System.out.println("Bernanke brings food to the customer");        
    }
}
