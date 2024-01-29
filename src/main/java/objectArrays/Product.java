public  class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int compareTo(Product Product2) {
        return Double.compare(this.price, Product2.price);
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, 5.7, 31.0);
        Product product2 = new Product(2, 4.3, 18.0);

        int result = product1.compareTo(product2);

        if (result < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (result > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " and " + product2 + " have the same price.");
        }
    }
}
