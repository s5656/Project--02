package shoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Buy {
    public static void main(String[] args) {//main method
        Shopping shopping=new Shopping();
    ArrayList<Products> cart = new ArrayList();
    Scanner in =new Scanner(System.in);
    while (true) {
        System.out.println("Things you want to add");
        System.out.println("1.Apple");
        System.out.println("2.Milk");
        System.out.println("3.NewsPaper");
        int num = in.nextInt();
        switch (num){
            case 1:{
                cart.add(new Products("Apple",200));
                break;
            }
            case 2: {
                cart.add(new Products("Milk",34));
                break;
            }
            case 3:{
                cart.add(new Products("NewsPaper",10));
                break;
            }
        }
        System.out.println("you want to add more things");
        System.out.println("Y or N");
        if(in.next().equalsIgnoreCase("N")){
            break;
        }

    }
    System.out.println("Product in cart are"+cart);

    EPayment ePayment =new EPayment();
    Bill bill=new Bill();
    System.out.println("You have to pay "+ePayment.payment(bill.billGenration(cart)));

    shopping.milkOffer(cart);
    System.out.println("You got this products"+cart);

    }
}
