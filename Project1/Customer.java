package Project1;

public class Customer implements CustomerInterface {
    @Override
    public void eats() {
        System.out.println("Customer eats food");
    }
    @Override
    public void leaves() {
        System.out.println("Customer finished food and leaves");
    }
    
}
