package Project1;
import java.awt.*;
import java.lang.*;

public class Restaurant {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            RunnableOne runnable = new RunnableOne();
            Thread thread = new Thread(runnable);
            RunnableTwo runnableTwo = new RunnableTwo();
            Thread thread2 = new Thread(runnableTwo);
            RunnableThree runnableThree = new RunnableThree();
            Thread thread3 = new Thread(runnableThree);
            thread.start(); //starting thread
            try {thread.join(3000);} catch (InterruptedException e) {e.printStackTrace();}
            thread2.start();
            try {thread2.join(3400);} catch (InterruptedException e) {e.printStackTrace();}        
            thread3.start();
        }
        
    }
    
}


