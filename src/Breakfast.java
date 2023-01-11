public class Breakfast {
    String price;
    String name;

    public Breakfast(String name) {
        this.name = name;
        this.price = "10";
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
