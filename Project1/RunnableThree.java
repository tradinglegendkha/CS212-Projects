package Project1;

public class RunnableThree implements Runnable {
    @Override
    public void run() {
        WaiterThree waiter = new WaiterThree();
        Customer customer = new Customer();
        for(int i=0; i<1; i++) {
            waiter.seatsCust();
            try {Thread.sleep(1900);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.takesOrder();
            try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsOrder();
            try {Thread.sleep(1800);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsFood();
            try {Thread.sleep(2100);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            customer.eats();
            try {Thread.sleep(3300);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            customer.leaves();
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }



    }
}
