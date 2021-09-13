package ArraysLecture;

public class Product {

    private String name;

    private int priceInCents;

    // getters and setters -----------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    // constructor --------------
    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    // instance methods -------------
    public void printDetails() {
        System.out.println("Product name is: " + this.name + ". The product price is " + this.priceInCents/100);
    }


    // static method --------------
    public static double findAveragePrice(Product[] products) {
        double priceInTotal = 0.0;
        for (Product product : products) {
            priceInTotal += product.getPriceInCents();
        }
        return (int) (priceInTotal/products.length);
    }


    public static void main(String[] args) {
        // products array
        Product[] products = {
          new Product("Hammer", 2300),
          new Product("Screwdriver", 300),
          new Product("Wrench", 20000)
        };

        double average = Product.findAveragePrice(products);
        System.out.println(average);


    }

}
