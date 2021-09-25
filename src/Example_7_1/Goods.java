package Example_7_1;

public class Goods implements Selling, Delivery, SanitaryStation{

    private double price;
    private double size;
    private double weight;
    private String description;
    private String address;
    private int expiryDate;

    public Goods(double price, double size, double weight, String description, String address, int expiryDate) {
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.description = description;
        this.address = address;
        this.expiryDate = expiryDate;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
