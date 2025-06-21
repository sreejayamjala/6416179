public class PhonePeAdapter implements PaymentProcessor {
    private PhonePeGateway phonepe;

    public PhonePeAdapter(PhonePeGateway phonepe) {
        this.phonepe = phonepe;
    }

    public void processPayment(double amount) {
        phonepe.phonePe(amount);
    }
}
