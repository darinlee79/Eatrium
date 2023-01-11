public class Snack {
    String price;
    String name;

    public Snack(String name) {
        this.name = name;
        this.price = "5";
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
