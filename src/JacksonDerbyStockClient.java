public class JacksonDerbyStockClient {
    public static void main(String[] args) {
        JacksonDerbyStock Apple = new JacksonDerbyStock("Apple", 235.72, 5, 100);
        System.out.println(Apple);
        Apple.buyShares(20);
        System.out.println(Apple);
        Apple.sellShares(15);
        System.out.println(Apple);
    }
}
