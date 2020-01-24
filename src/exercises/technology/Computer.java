package exercises.technology;

public class Computer {
    String brand;
    int price;
    double storage;

    public Computer(String brand, int price, double storage) {
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
}
