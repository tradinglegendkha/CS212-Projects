package Project1;
import java.lang.*;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Thread: "+i);
            try {
                Thread.sleep(1000); //time in miliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread is now complete");
    }
}
