package Project1;

public class RunnableThree implements Runnable { //this runs Bernanke
    @Override
    public void run() {
        WaiterThree waiter = new WaiterThree();
        Customer customer = new Customer();
        //synchronized(this) {}
        for(int i=0; i<1; i++) { //1 in i<1 tells that it should only release one copy of the method
            //try {wait();} catch (InterruptedException e1) {e1.printStackTrace();}
            waiter.seatsCust();
            try {Thread.sleep(1900);} catch (InterruptedException e) {e.printStackTrace();}
        }        
        for(int i=0; i<1; i++) {
            waiter.takesOrder();
            try {Thread.sleep(1800);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsOrder();
            try {Thread.sleep(1700);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsFood();
            try {Thread.sleep(2600);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            customer.eats();
            try {Thread.sleep(2600);} catch (InterruptedException e) {e.printStackTrace();}
        }
        //synchronized(this) {}            
        for(int i=0; i<1; i++) {
            customer.leaves();
            try {Thread.sleep(3900);} catch (InterruptedException e) {e.printStackTrace();}
            //notifyAll();
        }
    }
}
