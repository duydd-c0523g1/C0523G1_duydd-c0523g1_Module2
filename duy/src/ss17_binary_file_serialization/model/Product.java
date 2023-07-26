package ss17_binary_file_serialization.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String brand;
    private String desc;
    public Product() {
    }

    public Product(int id, String name, int price, String brand, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + price + "," + brand + "," + desc;
    }
}