public class MobileApp implements Observer {
    public void update(double price) {
        System.out.println("Mobile App - New price: Rs" + price);
    }
}
