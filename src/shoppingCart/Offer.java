package shoppingCart;

public class Offer {

    public int getMilkOffer(int items) {
        int num =items >= 2 ? items+(items/2):items;
        return num;
    }
    public int offers(String name, int noOfItems) {
        if(name.equalsIgnoreCase("Milk")){
            System.out.println("Offer: Buy 2 units of Milk  get 1 unit free");
            int items=getMilkOffer(noOfItems);
            System.out.println("You have brought "+noOfItems+" units of Milk. You get "+items+" units of Milk");
            return items;
        }
        return noOfItems;
    }
    public void checkOffers(Product product){
        int updatredItems  =offers(product.getName(), product.getNoOfItems());
        product.setNoOfItems(updatredItems);
    }
}
