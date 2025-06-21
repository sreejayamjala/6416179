public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.register(mobile);
        stockMarket.register(web);

        stockMarket.setPrice(100.5); // both get update
        stockMarket.setPrice(102.8); // both get update
    }
}
