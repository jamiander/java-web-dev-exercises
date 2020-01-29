package exercises.technology;

public class Computer extends AbstractEntity {
    String brand;
    int price;
    double storage;
    static int numIds = 0;

    public Computer(int id, String brand, int price, double storage) {
        super(id);
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }

    public String buy(int price, int budget) {
        if(price < 1000) {
            return "buy";
        }
        return "do not buy";
    }

    public String store(double storage, double memoryNeed) {
        if(storage > memoryNeed) {
            return "The file can be stored.";
        }
        return "There is not enough storage.";
    }

    public int setId() {
        id = ++numIds;
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

}
