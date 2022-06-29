package Project1;
import java.awt.*;
import java.lang.*;

public class Restaurant {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        thread.start(); //starting thread




        
    }
    
}


