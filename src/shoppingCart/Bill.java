package shoppingCart;

import java.util.ArrayList;

public class Bill {
    public double billGenration(ArrayList<Products> bill){
        Shopping shopping =new Shopping();
        shopping.milkOffer(bill);
        double rs =0;
        for (Products amount:bill){
            rs+=amount.getPrice();
        }
        return rs;
    }
}
