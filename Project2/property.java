package Project2;

public class property {
    private String name;
    private String kind;
    private int size;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public property(String name, String kind, int size, double price) {
        this.name = name;
        this.kind = kind;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\t" + kind + "\t" + size + "\t" + price;
    }
}
