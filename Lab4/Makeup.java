package Lab4;

public class Makeup {
    private String brand;
    private String function;
    private int price;
    private String kind;
    private String placeApplication;

    public Makeup(String brand, String function, int price, String kind, String placeApplication) {
        this.brand = brand;
        this.function = function;
        this.price = price;
        this.kind = kind;
        this.placeApplication = placeApplication;
    }
    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getFunction() {
        return function;
    }

    public String getKind() { return kind; }

    public String getPlaceApplication() {
        return placeApplication;
    }
}
