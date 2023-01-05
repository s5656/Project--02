package shoppingCart;

public class Products {

    private String name;
    private int price;

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Products() {
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

}
