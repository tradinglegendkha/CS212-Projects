package Project1;
import java.lang.*;

public class RunnableOne implements Runnable {
    @Override
    public void run() {
        Waiter waiter = new Waiter();
        Customer customer = new Customer();
        for(int i=0; i<1; i++) {
            waiter.seatsCust();
            try {Thread.sleep(1900);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.takesOrder();
            try {Thread.sleep(1600);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsOrder();
            try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            waiter.bringsFood();
            try {Thread.sleep(1900);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            customer.eats();
            try {Thread.sleep(2300);} catch (InterruptedException e) {e.printStackTrace();}
        }
        for(int i=0; i<1; i++) {
            customer.leaves();
            try {Thread.sleep(3700);} catch (InterruptedException e) {e.printStackTrace();}
        }

        
    }
    
}
