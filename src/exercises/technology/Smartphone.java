package exercises.technology;

public class Smartphone extends Computer {
    String camera;

    public Smartphone(String brand, int price, double storage, String camera) {
        super(brand, price, storage);
        this.camera = camera;
    }

    public double numPictures(double storage) {
        double pictureStorage = 10;
        return storage/pictureStorage;
    }
}
