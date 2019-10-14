class Calculator {

    private double gross(Product product) {
        switch (product.getCategory()) {
            case 23:
                return product.getNetPrice() * 1.23;
            case 8:
                return product.getNetPrice() * 1.08;
            default:
                System.out.println("Produkt " + product.getName() + " nie należy do kategorii Vat 8% ani 23% ");
                return 0;
        }
    }

    public String getInfo(Product product) {
        double grossPrice = gross(product);
        return product.getName() + ", cena brutto: " + grossPrice + " zł.";
    }
}