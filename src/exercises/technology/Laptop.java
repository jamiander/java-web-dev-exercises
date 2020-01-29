package exercises.technology;

public class Laptop extends Computer {
    double size;

    public Laptop (int id, String brand, int price, double storage, double size) {
        super(id, brand, price, storage);
        this.size = size;
    }

    public String laptopBag(double size) {
        if (size > 15) {
            return "Need a new laptop bag";
        }
        return "Use the old laptop bag";
    }
}
