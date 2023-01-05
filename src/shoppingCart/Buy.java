package shoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Buy {
    public static void main(String[] args) {//main method
        ArrayList<Products> cart = new ArrayList();

        cart.add(new Products("Apple",200));
        cart.add(new Products("Milk",34));
        cart.add(new Products("NewsPaper",10));
        cart.add(new Products("Milk",34));

        EPayment ePayment =new EPayment();
        Bill bill=new Bill();
        System.out.println("You have to pay "+ePayment.payment(bill.billGenration(cart)));
        Shopping shopping =new Shopping();
        shopping.milkOffer(cart);
        System.out.println("You got this products"+cart);

    }
}
