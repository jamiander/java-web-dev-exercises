package exercises.technology;

public class Smartphone extends Computer {
    String camera;

    public Smartphone(int id, String brand, int price, double storage, String camera) {
        super(id, brand, price, storage);
        this.camera = camera;
    }

    public double numPictures(double storage) {
        double pictureStorage = 2;
        return storage/pictureStorage;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
