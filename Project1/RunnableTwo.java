package Project1;

public class RunnableTwo implements Runnable { //this runs Rebecca
    @Override
    public void run() {
        WaiterTwo waiter = new WaiterTwo();
        Customer customer = new Customer();
        //synchronized(this) {}
        for(int i=0; i<1; i++) { //1 in i<1 tells that it should only release one copy of the method
            //try {wait();} catch (InterruptedException e1) {e1.printStackTrace();}
            waiter.seatsCust();
            try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.takesOrder();
            try {Thread.sleep(1300);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsOrder();
            try {Thread.sleep(1400);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsFood();
            try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            customer.eats();
            try {Thread.sleep(2300);} catch (InterruptedException e) {e.printStackTrace();}
        }
        //synchronized(this) {}
        for(int i=0; i<1; i++) {
            customer.leaves();
            try {Thread.sleep(3900);} catch (InterruptedException e) {e.printStackTrace();}
            //notifyAll();
        }
    }
}
