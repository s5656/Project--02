package shoppingCart;

import java.util.ArrayList;

public class Shopping {
    public void milkOffer(ArrayList<Products> milkbill){
        int count=0;
        for (Products milk:milkbill){
            if (milk.getName().equalsIgnoreCase("milk")) {
                count++;//count
            }
        }
        if (count==2) {
            milkbill.add(new Products("Milk", 34));
        }
        if (count==4) {
            milkbill.add(new Products("Milk", 34));
            milkbill.add(new Products("Milk", 34));
        }
    }
    public double billGenration(ArrayList<Products> bill){
        double rs =0;
        for (Products amount:bill){
            rs+=amount.getPrice();
        }
        return rs;
    }
}
