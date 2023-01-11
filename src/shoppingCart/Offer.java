package shoppingCart;

public class Offer {

    public int getMilkOffer(int items) {
        if (items >= 2) {
            return (items+(items/2));
        }
        return items;
    }
    public int offers(String name, int noOfItems) {
        if(name.equalsIgnoreCase("Milk")){
            System.out.println("Milk has Offer Buy 2 get 1 free");
            return getMilkOffer(noOfItems);
        }
        return 0;
    }
    public void cheakOffers(Product product){
        product.setNoOfItems(offers(product.getName(), product.getNoOfItems()));
    }
}
