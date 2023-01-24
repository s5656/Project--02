package shoppingCart;

import java.util.HashMap;

public class Bill implements BillGenrate{
    private double total;
    public double eWalletPayment() {

        return total>=100 ? total-(total * 0.05) : total;
    }
    public void generateBill(HashMap<Product, Integer> cartData) {
        for (HashMap.Entry<Product,Integer> map : cartData.entrySet()) {

            total += (map.getKey().getPrice() * map.getValue());
        }
        System.out.println("Your total bill : "+total);
    }
}
