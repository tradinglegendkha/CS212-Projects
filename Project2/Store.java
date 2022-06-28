package Project2;

public class Store {
    private int orders, manager;
    private String customerName;
    Pants pants = new Pants();
    Shirts shirts = new Shirts();
    Suits suits = new Suits();
    public static void main(String[] args) {
                
    }
    //default
    public Store() {
        pants.setPants(0);  
        shirts.setShirts(0);    //these will increase by 1 if a customer makes an order
        suits.setSuits(0);
    }

    public String customerOrder(String customerName, String orders) {
        if (orders=="pants") {
            return 
        }
        else if (orders=="shirts") {
            return 
        }
        else if (orders=="suits") {
            return 
        }
        
    }

    //getters and setters
    public int getOrders() {
        return orders;
    }
    public void setOrders(int orders) {
        this.orders = orders;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getManager() {
        return manager;
    }
    public void setManager(int manager) {
        this.manager = manager;
    }
}
