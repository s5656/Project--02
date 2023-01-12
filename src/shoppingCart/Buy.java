package shoppingCart;

import java.util.HashMap;

public class Buy {
    public static void main(String[] args) {

        Product apple=new Product("Apple",20,12);
        Product milk=new Product("Milk",34,2);
        Product newsPaper=new Product("NewsPaper",10,1);

        HashMap<Product,Integer> cartData =new HashMap<>();
        cartData.put(apple, apple.getNoOfItems());
        cartData.put(milk, milk.getNoOfItems());
        cartData.put(newsPaper, newsPaper.getNoOfItems());
        System.out.println("Your products in cart"+cartData);

        Offer offer=new Offer();
        offer.checkOffers(milk);
        offer.checkOffers(apple);
        offer.checkOffers(newsPaper);

        Bill bill= new Bill();
        bill.generateBill(cartData);
        System.out.println("5% discount Offer is Applied on e-Wallet");
        System.out.println("You have to pay : "+bill.eWalletPayment());


    }
}
