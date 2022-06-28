package Project1;
import java.awt.*;
import java.lang.*;

public class Restaurant {
    private String food;

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        thread.start(); //starting thread



    }
    /*
    public waiterseatCust() {
        
    }

    public bringtoChef() {

    }

    public custEat() {

    }
     */

    //setters and getters 
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

}
