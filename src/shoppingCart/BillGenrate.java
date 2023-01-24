package shoppingCart;

import java.util.HashMap;

public interface BillGenrate {
    double eWalletPayment();
    void generateBill(HashMap<Product, Integer> cartData);
}
