public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Product product1 = new Product("czekolada", 2, 23);
        System.out.println(calculator.getInfo(product1));

        Product product2 = new Product("cytryny", 4, 8);
        System.out.println(calculator.getInfo(product2));

        Product product3 = new Product("trawa", 40, 3);
        System.out.println(calculator.getInfo(product3));
    }
}