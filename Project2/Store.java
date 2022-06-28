package Project2;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    //Collection of store varieties
    ArrayList<property> goodsList = new ArrayList<>();
    //shopping cart collection
    ArrayList<property> stoCarList = new ArrayList<>();

    //How to add items to the store
    public void addGoods() {
        System.out.println("Please enter the added pet information (name->type->size->price):");
        //Create an object goods property, type goods
        property pty = new property(getString(), getString(), getInt(), getDouble());
        //Determine whether to add to the goodsList collection
        boolean bool = goodsList.add(pty);
        if (bool == true) {
            System.out.println("Added successfully!");
        } else {
            System.out.println("add failed!");
        }
    }

    //Display shopping store item method
    public void showGoods() {
        boolean bool = goodsList.isEmpty();
        if (bool != true) {
            System.out.println("serial number" + "\t" + "name" + "\t" + "type" + "\t" + "age" + "\t" + "price");
            //define a sequence number
            int n = 1;
            //Traverse out store items
            for (property property : goodsList) {
                System.out.println(n + "\t" + property);
                n++;
            }
            System.out.println(" ");
        } else {
            System.out.println("The store is under maintenance, and there are no items at the moment!");
            System.out.println(" ");
        }
    }

    //How to buy items into the shopping cart
    public void buyGoods() {
        boolean bool = goodsList.isEmpty();
        if (bool != true) {
            System.out.print("Please enter the serial number of the pet you want to buy:");
            //Enter the serial number of the purchased pet
            int n = getInt();
            //Prevent subscript out of bounds
            if (n <= goodsList.size()) {
                stoCarList.add(goodsList.get((n - 1)));
                goodsList.remove((n - 1));
                System.out.println("Successful purchase!");
                System.out.println(" ");
            } else {
                System.out.println("Failed purchase!");
                System.out.println("The pet you want doesn't exist, please check the store's existing pets!");
                System.out.println(" ");
            }
        } else {
            System.out.println("The store is under maintenance, and there are currently no items available for purchase!");
            System.out.println(" ");
        }
    }

    //View Cart Method
    public void showShopCar() {
        boolean bool = stoCarList.isEmpty();
        if (bool != true) {
            System.out.println("-------shopping cart-------");
            System.out.println("serial number" + "\t" + "Goods_name" + "\t" + "type" + "\t" + "size" + "\t" + "price");
            shopList();
            System.out.println(" ");
        } else {
            System.out.println("You haven't bought a pet goods!");
            System.out.println(" ");
        }
    }

    //Shopping cart checkout method
    public void totalPrice() {
        boolean bool = stoCarList.isEmpty();
        if (bool != true) {
            System.out.println("-------List-------");
            System.out.println("serial number" +
                                "Goods_name" +
                                "\t" + "type" +
                                "\t" + "size" +
                                "\t" + "price" +
                                "\t");
            shopList();
            //empty cart
            stoCarList.clear();
            //Check if the shopping cart is empty
            if (stoCarList.isEmpty()) {
                System.out.println("Successful settlement!");
                System.out.println(" ");
            } else {
                System.out.println("Settlement failed!");
                System.out.println(" ");
            }
        }else {
            System.out.println("There are no goods in the shopping cart, please purchase first and then settle!");
            System.out.println(" ");
        }
    }

    //How to delete an item from the shopping cart
    public void delStoreCar() {
        boolean bool = stoCarList.isEmpty();
        if (bool != true) {
            System.out.print("Please enter the serial number of the pet you want to delete in the shopping cart:");
            int n = getInt();
            //防止下标越界
            if ((n - 1) <= stoCarList.size()) {
                stoCarList.remove((n - 1));
                System.out.println("successfully deleted!");
                System.out.println(" ");
            } else {
                System.out.println("failed to delete!");
                System.out.println("Please check your cart for Goods!");
                System.out.println(" ");
            }
        } else {
            System.out.println("You have not purchased an item, no need to delete it!");
            System.out.println(" ");
        }
    }

    //delete an item from the store
    public void delGoodsList() {
        boolean bool = goodsList.isEmpty();
        if (bool != true) {
            System.out.print("Please enter the serial number of the pet you want to delete in the store：");
            int n = getInt();
            //Prevent subscript out of bounds
            if ((n - 1) <= goodsList.size()) {
                goodsList.remove((n - 1));
                System.out.println("successfully deleted!");
                System.out.println(" ");
            } else {
                System.out.println("failed to delete!");
                System.out.println("Please check store goods for presence!");
                System.out.println(" ");
            }
        } else {
            System.out.println("There are no goods in the store yet!");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store shop = new Store();
        while (true) {
            System.out.println("--------"+"Welcome our Store"+"--------");
            System.out.println("Please enter the serial number (" +
                    "1: Add goods " +
                    "2: Remove goods " +
                    "3: Open the mall " +
                    "4: Purchase " +
                    "5: Open the shopping cart " +
                    "6: Delete the shopping cart pet " +
                    "7: Checkout " +
                    "8: Leave" +
                    ")");
            switch (sc.nextInt()) {
                case 1:
                    shop.addGoods();
                    break;
                case 2:
                    shop.delGoodsList();
                    break;
                case 3:
                    shop.showGoods();
                    break;
                case 4:
                    shop.buyGoods();
                    break;
                case 5:
                    shop.showShopCar();
                    break;
                case 6:
                    shop.delStoreCar();
                    break;
                case 7:
                    shop.totalPrice();
                    break;
                case 8:
                    System.out.println("Goodbye");
                    return;
            }
        }
    }


    //Encapsulate the shopping list method to improve the usability of the code
    public void shopList() {
        double total = 0;
        //serial number counter
        int n = 1;
        //traverse the cart
        for (int i = 0; i < stoCarList.size(); i++) {
            System.out.println(n + "\t" + stoCarList.get(i));
            property price = stoCarList.get(i);
            total += price.getPrice();
            n++;
        }
        System.out.println("Total：" + "\t" + "\t" + "\t" + total);
    }

    /*
     * There is no object type created here,
     *  because when an object is created, when typing data,
     * it will cause InputMismatchException due to the conflict of object data types.
     * */
    public static String getString() {
        Scanner a = new Scanner(System.in);
        return a.next();
    }

    public static int getInt() {
        Scanner b = new Scanner(System.in);
        return b.nextInt();
    }

    public static double getDouble() {
        Scanner c = new Scanner(System.in);
        return c.nextDouble();
    }

}
