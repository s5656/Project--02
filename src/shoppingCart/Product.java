package shoppingCart;

public class Product {

    private String name;
    private int price;
    private int noOfItems;
    @Override
    public String toString() {
        return name;
    }

    public Product(String name, int price,int noOfItems) {
        this.name = name;
        this.price = price;
        this.noOfItems=noOfItems;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

}
