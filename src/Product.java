class Product {
    private String name;
    private double netPrice;
    private int category;

    public Product() {
    }

    public Product(String name, double netPrice, int category) {
        this.name = name;
        this.netPrice = netPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}